class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int harga;

//Setter
public void setNama(String nama){
    this.nama = nama;
}
public void setStok(int stok){
    this.stok = stok;
}
public void setHargaSatuan(int hargaSatuan){
    this.hargaSatuan = hargaSatuan;
    this.harga = stok * hargaSatuan;
}
//Getter
public String getNama(){
    return nama;
}
public int getStok(){
    return stok;
}
public int getHargaSatuan(){
    return hargaSatuan;
}
public int getHarga(){
    return harga;
}

}
public class PenjualAlatTulis {
    private AlatTulis[] alatTulis;
    private int totalHarga;

    public PenjualAlatTulis(AlatTulis[] alatTulis) {
        this.alatTulis = alatTulis;
        this.totalHarga = 0;
        for (AlatTulis alat : alatTulis) {
            totalHarga+= alat.getHarga();

        }
    }



public int getTotalHarga() {
    return totalHarga;
}
public void displayAlatTulis() {
    for(AlatTulis alat : alatTulis) {
        System.out.println("Nama Alat Tulis: " + alat.getNama());
        System.out.println("Stok: " + alat.getStok());
        System.out.println("Harga Satuan: " + alat.getHargaSatuan());
        System.out.println("Harga: " + alat.getNama()+ " : " + alat.getHargaSatuan());
    }
    System.out.println("Total Harga: " + getTotalHarga());
}
public static void main(String[] args) {
    AlatTulis bolpoint = new AlatTulis();
    bolpoint.setNama("Bolpoint");
    bolpoint.setStok(10);
    bolpoint.setHargaSatuan(2000);

    AlatTulis pensil = new AlatTulis();
    pensil.setNama("Pensil");
    pensil.setStok(10);
    pensil.setHargaSatuan(1000);

    AlatTulis penghapus = new AlatTulis();
    penghapus.setNama("Pensil");
    penghapus.setStok(20);
    penghapus.setHargaSatuan(500);

    AlatTulis[] alatTulis = {bolpoint, penghapus, pensil};
    PenjualAlatTulis penjual = new PenjualAlatTulis(alatTulis);
    penjual.displayAlatTulis();
}
}