from stackClass import stack_function

class main:

    def main():
        null_str = ""
        input_data = str(input("Input Data : "))
        object = stack_function(len(input_data))
        for x in input_data:
            object.push(x)

        for x in input_data:
            null_str = null_str + object.pop()

        print("Reverse data : ", null_str)

    if (__name__ == "__main__"):
        main()
