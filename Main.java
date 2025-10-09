class PersegiPanjang {
    double panjang, lebar;

    PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran {
    double r;

    Lingkaran(double jari) {
        r = jari;
    }

    double hitungLuas() {
        return 3.14 * r * r;
    }

    double hitungKeliling() {
        return 2 * 3.14 * r;
    }
}

class Segitiga {
    double alas, tinggi, sisi1, sisi2, sisi3;

    Segitiga(double a, double t, double s1, double s2, double s3) {
        alas = a;
        tinggi = t;
        sisi1 = s1;
        sisi2 = s2;
        sisi3 = s3;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}


class Kubus {
    double sisi;

    Kubus(double s) {
        sisi = s;
    }

    double hitungVolume() {
        return sisi * sisi * sisi;
    }

    double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}

class Balok {
    double panjang, lebar, tinggi;

    Balok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Bola {
    double r;

    Bola(double jari) {
        r = jari;
    }

    double hitungVolume() {
        return 4.0 / 3 * 3.14 * r * r * r;
    }

    double hitungLuasPermukaan() {
        return 4 * 3.14 * r * r;
    }
}

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        Lingkaran ling = new Lingkaran(7);
        Segitiga sgt = new Segitiga(6, 4, 3, 4, 5);
        Kubus kb = new Kubus(4);
        Balok blk = new Balok(5, 3, 2);
        Bola bl = new Bola(7);

        System.out.println("=== Bangun Datar ===");
        System.out.println("Persegi Panjang: Luas = " + pp.hitungLuas() + ", Keliling = " + pp.hitungKeliling());
        System.out.println("Lingkaran: Luas = " + ling.hitungLuas() + ", Keliling = " + ling.hitungKeliling());
        System.out.println("Segitiga: Luas = " + sgt.hitungLuas() + ", Keliling = " + sgt.hitungKeliling());

        System.out.println("\n=== Bangun Ruang ===");
        System.out.println("Kubus: Volume = " + kb.hitungVolume() + ", Luas Permukaan = " + kb.hitungLuasPermukaan());
        System.out.println("Balok: Volume = " + blk.hitungVolume() + ", Luas Permukaan = " + blk.hitungLuasPermukaan());
        System.out.println("Bola: Volume = " + bl.hitungVolume() + ", Luas Permukaan = " + bl.hitungLuasPermukaan());
    }
}
