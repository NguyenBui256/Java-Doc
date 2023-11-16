public class Pen extends Item{
    static int soLuong = 0;
    private String mauSac, chatLieu, loaiMuc, doMin;

    public Pen(String ten, String giaBan, String thuongHieu, String mauSac, String chatLieu, String loaiMuc, String doMin) {
        this.ten = ten;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.loaiMuc = loaiMuc;
        this.doMin = doMin;
    }
    @Override
    public void show()
    {
        System.out.printf("Tên sản phẩm: %s\n", this.getTen());
        System.out.printf("Giá bán: %s\n", this.getGiaBan());
        System.out.printf("Thương hiệu: %s\n", this.getThuongHieu());
        System.out.printf("Màu sắc: %s\n", this.getMauSac());
        System.out.printf("Chất liệu: %s\n", this.getChatLieu());
        System.out.printf("Loại mực: %s\n", this.getLoaiMuc());
        System.out.printf("Độ mịn: %s\n", this.getDoMin());
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public String getLoaiMuc() {
        return loaiMuc;
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

    public String getDoMin() {
        return doMin;
    }
}
