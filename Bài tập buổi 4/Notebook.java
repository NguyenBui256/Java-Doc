public class Notebook {

    static int soLuong = 0;
    private String ten, giaBan, soTrang, thuongHieu, loaiVo, mauSac, chatLieu, kichThuoc;

    public Notebook(String ten, String giaBan, String soTrang, String thuongHieu, String loaiVo, String mauSac, String chatLieu, String kichThuoc) {
        this.ten = ten;
        this.giaBan = giaBan;
        this.soTrang = soTrang;
        this.thuongHieu = thuongHieu;
        this.loaiVo = loaiVo;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
        soLuong += 1;
    }

    public void show()
    {
        System.out.printf("Tên sản phẩm: %s\n", this.getTen());
        System.out.printf("Giá bán: %s\n", this.getGiaBan());
        System.out.printf("Thương hiệu: %s\n", this.getThuongHieu());
        System.out.printf("Số trang: %s\n", this.getSoTrang());
        System.out.printf("Loại vở: %s\n", this.getLoaiVo());
        System.out.printf("Màu sắc bìa: %s\n", this.getMauSac());
        System.out.printf("Chất liệu giấy: %s\n", this.getChatLieu());
        System.out.printf("Kích thước: %s\n", this.getKichThuoc());
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

    public String getSoTrang() {
        return soTrang;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getLoaiVo() {
        return loaiVo;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }
}
