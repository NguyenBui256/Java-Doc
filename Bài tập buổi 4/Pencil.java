public class Pencil {

    static int soLuong = 0;
    private String ten, giaBan, thuongHieu, mauSac, chatLieu, doCung;

    public Pencil(String ten, String giaBan, String thuongHieu, String mauSac, String chatLieu, String doCung) {
        this.ten = ten;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.doCung = doCung;
        soLuong += 1;
    }

    public void show()
    {
        System.out.printf("Tên sản phẩm: %s\n", this.getTen());
        System.out.printf("Giá bán: %s\n", this.getGiaBan());
        System.out.printf("Thương hiệu: %s\n", this.getThuongHieu());
        System.out.printf("Màu sắc: %s\n", this.getMauSac());
        System.out.printf("Chất liệu: %s\n", this.getChatLieu());
        System.out.printf("Độ cứng: %s\n", this.getDoCung());
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public String getTen() {
        return ten;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public String getDoCung() {
        return doCung;
    }
}
