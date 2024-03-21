public class tugas {
    // Antarmuka PaymentStrategy mendefinisikan kontrak untuk semua strategi pembayaran
    interface PaymentStrategy {
        void bayar(int jumlah);
    }

    // Implementasi konkret dari PaymentStrategy untuk metode pembayaran yang berbeda
    static class PembayaranKartuKredit implements PaymentStrategy {
        private String nomorKartuKredit;

        public PembayaranKartuKredit(String nomorKartuKredit) {
            this.nomorKartuKredit = nomorKartuKredit;
        }

        @Override
        public void bayar(int jumlah) {
            System.out.println("Membayar " + jumlah + " menggunakan nomor kartu kredit: " + nomorKartuKredit);
        }
    }

    static class PembayaranPayPal implements PaymentStrategy {
        private String email;

        public PembayaranPayPal(String email) {
            this.email = email;
        }

        @Override
        public void bayar(int jumlah) {
            System.out.println("Membayar " + jumlah + " menggunakan akun PayPal: " + email);
        }
    }

    static class PembayaranBitcoin implements PaymentStrategy {
        private String alamatBitcoin;

        public PembayaranBitcoin(String alamatBitcoin) {
            this.alamatBitcoin = alamatBitcoin;
        }

        @Override
        public void bayar(int jumlah) {
            System.out.println("Membayar " + jumlah + " menggunakan alamat Bitcoin: " + alamatBitcoin);
        }
    }

    // Kelas Konteks yang menggunakan PaymentStrategy
    static class KeranjangBelanja {
        private PaymentStrategy strategiPembayaran;

        public void aturStrategiPembayaran(PaymentStrategy strategiPembayaran) {
            this.strategiPembayaran = strategiPembayaran;
        }

        public void checkout(int jumlah) {
            strategiPembayaran.bayar(jumlah);
        }
    }

    // Kode klien
    public static class Utama {
        public static void main(String[] args) {
            KeranjangBelanja keranjang = new KeranjangBelanja();

            // Memilih metode pembayaran secara dinamis
            keranjang.aturStrategiPembayaran(new PembayaranKartuKredit("1384-7678-9012-0406"));
            keranjang.checkout(120);

            keranjang.aturStrategiPembayaran(new PembayaranPayPal("jonatan@example.com"));
            keranjang.checkout(50);

            keranjang.aturStrategiPembayaran(new PembayaranBitcoin("PAssw0rdBTC0910"));
            keranjang.checkout(200);
        }
    }
}