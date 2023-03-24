def main():
    Hewan = ["Sapi", "Kelinci", "Kambing", "Unta", "Domba"]
    print("Hewan : ")
    print(Hewan)
    DeleteHewan = ["Kelinci", "Kambing", "Unta"]
    print("\nHewan yang ingin dihapus : ")
    print(DeleteHewan)
    for x in DeleteHewan:
        Hewan.remove(x)
    print("\nOutput Hewan : ")
    print(Hewan)

main()