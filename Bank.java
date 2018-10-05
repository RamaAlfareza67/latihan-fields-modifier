
public class Bank {

    public static void main(String[] args) {

        
        // System.out.println("Nama Bank : " + bank);

        Nasabah n=new Nasabah();

        System.out.println("Nama Bank : " + n.bank);
        n.Nasabah("Alfareza");
        n.tabungan(390);
        n.ambilUang(40);
        n.ambilUang(50,"Membeli Buah-buahan");
        n.ambilUang(300,"Membeli Rumah");

        System.out.println(n.getSaldo());
        System.out.println(n.getSaldo() + "  " + n.getPesan());

        System.out.println();
        Nasabah n1=new Nasabah();
        n1.Nasabah("Maulana");
        n1.tabungan(150);
        n1.ambilUang(40,"Membeli Motor");

        System.out.println(n1.getSaldo());
        System.out.println(n1.getSaldo() + "  " + n1.getPesan());
        
        System.out.println("\nTotal Transaksi Ambil Uang : " + n1.noTotal);
        
    }
    
}
