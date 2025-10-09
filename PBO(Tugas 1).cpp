#include <iostream>
#include <cmath>
using namespace std;

class PersegiPanjang {
public:
    double panjang, lebar;

    PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    double luas() {
        return panjang * lebar;
    }

    double keliling() {
        return 2 * (panjang + lebar);
    }
};

class Lingkaran {
public:
    double r;

    Lingkaran(double jari) {
        r = jari;
    }

    double luas() {
        return M_PI * r * r;
    }

    double keliling() {
        return 2 * M_PI * r;
    }
};

class BujurSangkar {
public:
    double sisi;

    BujurSangkar(double s) {
        sisi = s;
    }

    double luas() {
        return sisi * sisi;
    }

    double keliling() {
        return 4 * sisi;
    }
};

class BelahKetupat {
public:
    double d1, d2, sisi;

    BelahKetupat(double dd1, double dd2, double s) {
        d1 = dd1; d2 = dd2; sisi = s;
    }

    double luas() {
        return (d1 * d2) / 2;
    }

    double keliling() {
        return 4 * sisi;
    }
};

class Segitiga {
public:
    double alas, tinggi, sisi1, sisi2, sisi3;

    Segitiga(double a, double t, double s1, double s2, double s3) {
        alas = a; tinggi = t; sisi1 = s1; sisi2 = s2; sisi3 = s3;
    }

    double luas() {
        return 0.5 * alas * tinggi;
    }

    double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
};

// ======== Bangun Ruang ========
class Kubus {
public:
    double sisi;

    Kubus(double s) {
        sisi = s;
    }

    double volume() {
        return sisi * sisi * sisi;
    }

    double luasPermukaan() {
        return 6 * sisi * sisi;
    }
};

class Balok {
public:
    double p, l, t;

    Balok(double pj, double lb, double tg) {
        p = pj; l = lb; t = tg;
    }

    double volume() {
        return p * l * t;
    }

    double luasPermukaan() {
        return 2 * (p*l + p*t + l*t);
    }
};

class Kerucut {
public:
    double r, t, s;

    Kerucut(double rr, double tt, double ss) {
        r = rr; t = tt; s = ss;
    }

    double volume() {
        return (M_PI * r * r * t) / 3;
    }

    double luasPermukaan() {
        return M_PI * r * (r + s);
    }
};

class Bola {
public:
    double r;

    Bola(double rr) {
        r = rr;
    }

    double volume() {
        return (4.0/3.0) * M_PI * r * r * r;
    }

    double luasPermukaan() {
        return 4 * M_PI * r * r;
    }
};

class Silinder {
public:
    double r, t;

    Silinder(double rr, double tt) {
        r = rr; t = tt;
    }

    double volume() {
        return M_PI * r * r * t;
    }

    double luasPermukaan() {
        return 2 * M_PI * r * (r + t);
    }
};

int main() {
    PersegiPanjang pp(5, 3);
    cout << "Persegi Panjang: luas=" << pp.luas() << ", keliling=" << pp.keliling() << endl;

    Lingkaran ling(7);
    cout << "Lingkaran: luas=" << ling.luas() << ", keliling=" << ling.keliling() << endl;

    BujurSangkar bs(4);
    cout << "Bujur Sangkar: luas=" << bs.luas() << ", keliling=" << bs.keliling() << endl;

    BelahKetupat bk(6, 8, 5);
    cout << "Belah Ketupat: luas=" << bk.luas() << ", keliling=" << bk.keliling() << endl;

    Segitiga sg(6, 4, 3, 4, 5);
    cout << "Segitiga: luas=" << sg.luas() << ", keliling=" << sg.keliling() << endl;

    Kubus k(3);
    cout << "Kubus: volume=" << k.volume() << ", luas permukaan=" << k.luasPermukaan() << endl;

    Balok b(3, 4, 5);
    cout << "Balok: volume=" << b.volume() << ", luas permukaan=" << b.luasPermukaan() << endl;

    Kerucut kc(3, 5, 6);
    cout << "Kerucut: volume=" << kc.volume() << ", luas permukaan=" << kc.luasPermukaan() << endl;

    Bola bl(7);
    cout << "Bola: volume=" << bl.volume() << ", luas permukaan=" << bl.luasPermukaan() << endl;

    Silinder sl(4, 10);
    cout << "Silinder: volume=" << sl.volume() << ", luas permukaan=" << sl.luasPermukaan() << endl;

    return 0;
}

