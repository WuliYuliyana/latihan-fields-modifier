
public class nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    static int noUrut=0;
    
    public void nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama Nasabah : " + namaNasabah);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 500000 ){
            System.out.println("Maaf saldo anda tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("Penarikan tunai sebesar " + uang + " Berhasil.");
            noUrut++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String isi){
        if(saldo - uang < 500000 ){
            System.out.println("Maaf saldo anda tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("Penarikan tunai sebesar " + uang + " Berhasil.");
            noUrut++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   
}
