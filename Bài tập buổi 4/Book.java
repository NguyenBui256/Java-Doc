import java.util.ArrayList;

public class Book {

    static int soLuong = 0;

    public Book(String ten, String giaBan, String theLoai, String tacGia, String thuongHieu, String nhaXuatBan, String namXuatBan, String ngonNgu) {
        this.ten = ten;
        this.giaBan = giaBan;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.thuongHieu = thuongHieu;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.ngonNgu = ngonNgu;
        soLuong += 1;
    }

    public void show()
    {
        System.out.printf("Tên sản phẩm: %s\n", this.getTen());
        System.out.printf("Giá bán: %s\n", this.getGiaBan());
        System.out.printf("Thương hiệu: %s\n", this.getThuongHieu());
        System.out.printf("Thể loại: %s\n", this.getTheLoai());
        System.out.printf("Tác giả: %s\n", this.getTacGia());
        System.out.printf("Nhà xuất bản: %s\n", this.getNhaXuatBan());
        System.out.printf("Năm xuất bản: %s\n", this.getNgonNgu());
    }
    private String ten, giaBan, theLoai, tacGia, thuongHieu, nhaXuatBan, namXuatBan, ngonNgu;

    public static int getSoLuong() {
        return soLuong;
    }

    public String getTen() {
        return ten;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getThuongHieu() {
        return this.thuongHieu;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public String getNamXuatBan() {
        return namXuatBan;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }
}
