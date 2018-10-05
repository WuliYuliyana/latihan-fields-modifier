
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        nasabah n=new nasabah();
        n.nasabah("Wuli Yuliyana");
        n.tabungan(200000000);
        n.ambilUang(100000000);
        n.ambilUang(50000000,"DP MOBIL");

        System.out.println("Sisa saldo anda saat ini : " + n.getSaldo());
        System.out.println("Sisa saldo anda saat ini : " + n.getSaldo() + "  " + n.getPesan());

        System.out.println();
        nasabah n1=new nasabah();
        n1.nasabah("Eggi Fuji Pratama");
        n1.tabungan(50000000);
        n1.ambilUang(4000000);
        n1.ambilUang(2000000,"INFAQ MASJID");
        
        System.out.println("Sisa saldo anda saat ini : " + n.getSaldo());
        System.out.println("Sisa saldo anda saat ini : " + n.getSaldo() + "  " + n.getPesan());
        System.out.println("\nTotal Transaksi Ambil Uang : " + n1.noUrut);
        
    }
    
}
