def passCheckSmilarity(p1, p2):
    print("\nProccessing to checking password similarity")
    if(p1 != p2):
        print("Status : Succed")
        print("\nProccessing to checking password value")
        passCheckValue(p1, p2)

    if(p1 == p2):
        print("Status : Failed")
        print("\nYou cant input same password")

def passCheckValue(p1, p2):
    value01 = 0
    value02 = 0

    for x in p1:
        value01 += int.from_bytes(bytes(x, 'ascii'), "big")
    
    for x in p2:
        value02 += int.from_bytes(bytes(x, 'ascii'), "big")
   
    if(value01 != value02):
        print("Status : Failed")
        print("\nYour password its not same value")

    if(value01 == value02):
        print("Status : Succed")
        print("\nProccessing to dec code")
        dec(value01, value02)

def main():
    pass01 = input("Input Password 1 : ")
    pass02 = input("Input Password 2 : ")
    passCheckSmilarity(pass01, pass02)

def dec(val1, val2):
    file = open("Segitiga", "r")
    writeFile = open("Segitiga.java", "a")
    for x in file.readlines():
        writeFile.writelines(chr(val1 - int(x)))

if __name__ == "__main__":
    main()