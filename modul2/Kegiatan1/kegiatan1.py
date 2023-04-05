def main():
    arrayHewan = ["Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah"]
    arrayNum = []

    # Menambahkan Element
    arrayHewan.append("Badak")
    arrayHewan.append("Bebek")

    # Menghitung Banyak Element (Spesifik)
    bebekCount = arrayHewan.count("Bebek")

    # Mencari Index
    for x, y in enumerate(arrayHewan):
        if(y == "Bebek"):
            arrayNum.append(x)

    # Menghapus Bebek Pertama
    arrayHewan.remove('Bebek')

    # Menampilkan Index 0 dan 2
    print(arrayHewan[0])
    print(arrayHewan[2])

    # Menghapus Index Pertama
    arrayHewan.pop(0)

    # Mengubah Index Ke-0
    arrayHewan[0] = "Ular"

    # Menambakan Element Pada Index Ke-2
    arrayHewan.insert(2, "Itik")

    # Menghapus Range Index 1 dan 5
    y = 0
    for x, z in enumerate(arrayHewan):

        if(x == 5):
            break

        if(x > 1):
            arrayHewan.pop(x - y)
            y = y + 1

    # Menampilkan Index Pertama dan Terakhir
    print(arrayHewan[len(arrayHewan) - (len(arrayHewan) - 1) - 1])
    print(arrayHewan[len(arrayHewan) - 1])

    # Menampilkan Panjang Element
    print(len(arrayHewan))

    # Menampilkan Posisi index Badak
    print(arrayHewan.index("Badak"))

    # Pemahaman Tentang ArrayList
    print('Saya Tidak Paham apa", Saya Kebelet EEK')

if __name__ == "__main__":
    main()