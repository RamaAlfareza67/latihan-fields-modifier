public class Nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    static int noTotal=0;
    final String bank="Bank A";

    public void Nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama : " + namaNasabah);
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
        if(saldo- uang < 50 ){
            System.out.println("Maaf saldo anda tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("pengambilan " + uang + " sukses.");
            noTotal++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String isi){
        if(saldo - uang < 50 ){
            System.out.println("Maaf saldo anda tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("pengambilan " + uang + " sukses.");
            noTotal++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   
}
