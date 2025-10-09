# ==================== KELAS BANGUN DATAR ====================

class PersegiPanjang:
    def __init__(self, panjang, lebar):
        self.panjang = panjang
        self.lebar = lebar

    def hitung_luas(self):
        return self.panjang * self.lebar

    def hitung_keliling(self):
        return 2 * (self.panjang + self.lebar)


class Lingkaran:
    def __init__(self, r):
        self.r = r

    def hitung_luas(self):
        return 3.14 * self.r * self.r

    def hitung_keliling(self):
        return 2 * 3.14 * self.r


class Segitiga:
    def __init__(self, alas, tinggi, sisi1, sisi2, sisi3):
        self.alas = alas
        self.tinggi = tinggi
        self.sisi1 = sisi1
        self.sisi2 = sisi2
        self.sisi3 = sisi3

    def hitung_luas(self):
        return 0.5 * self.alas * self.tinggi

    def hitung_keliling(self):
        return self.sisi1 + self.sisi2 + self.sisi3


# ==================== KELAS BANGUN RUANG ====================

class Kubus:
    def __init__(self, sisi):
        self.sisi = sisi

    def hitung_volume(self):
        return self.sisi ** 3

    def hitung_luas_permukaan(self):
        return 6 * (self.sisi ** 2)


class Balok:
    def __init__(self, panjang, lebar, tinggi):
        self.panjang = panjang
        self.lebar = lebar
        self.tinggi = tinggi

    def hitung_volume(self):
        return self.panjang * self.lebar * self.tinggi

    def hitung_luas_permukaan(self):
        return 2 * (self.panjang * self.lebar + self.panjang * self.tinggi + self.lebar * self.tinggi)


class Bola:
    def __init__(self, r):
        self.r = r

    def hitung_volume(self):
        return 4/3 * 3.14 * (self.r ** 3)

    def hitung_luas_permukaan(self):
        return 4 * 3.14 * (self.r ** 2)


# ==================== CLASS TESTER / MAIN ====================

def main():
    # Buat objek dari masing-masing class
    pp = PersegiPanjang(5, 3)
    ling = Lingkaran(7)
    sgt = Segitiga(6, 4, 3, 4, 5)
    kb = Kubus(4)
    blk = Balok(5, 3, 2)
    bl = Bola(7)

    # Tampilkan hasil
    print("=== Bangun Datar ===")
    print(f"Persegi Panjang: Luas = {pp.hitung_luas()}, Keliling = {pp.hitung_keliling()}")
    print(f"Lingkaran: Luas = {ling.hitung_luas()}, Keliling = {ling.hitung_keliling()}")
    print(f"Segitiga: Luas = {sgt.hitung_luas()}, Keliling = {sgt.hitung_keliling()}")

    print("\n=== Bangun Ruang ===")
    print(f"Kubus: Volume = {kb.hitung_volume()}, Luas Permukaan = {kb.hitung_luas_permukaan()}")
    print(f"Balok: Volume = {blk.hitung_volume()}, Luas Permukaan = {blk.hitung_luas_permukaan()}")
    print(f"Bola: Volume = {bl.hitung_volume()}, Luas Permukaan = {bl.hitung_luas_permukaan()}")


# Jalankan program utama
if __name__ == "__main__":
    main()
