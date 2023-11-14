public class Book {

    public static int soLuong = 0;
    private String tieuDe, tacGia, theLoai, ngayXuatBan;

    Book(String tieuDe, String tacGia, String theLoai, String ngayXuatBan) {
        soLuong += 1;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.ngayXuatBan = ngayXuatBan;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }
}
