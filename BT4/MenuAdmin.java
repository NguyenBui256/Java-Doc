import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdmin {

    public void show()
    {
        System.out.println("1.Thêm item mới");
//        System.out.println("2.Xóa item");
//        System.out.println("3.Sửa item");
        System.out.println("4.Các chức năng của khách");
        System.out.println("5.Logout");
    }

    public void danhSach()
    {
        System.out.println("Lựa chọn item:");
        System.out.println("1.Sách");
        System.out.println("2.Vở ghi");
        System.out.println("3.Bút chì");
        System.out.println("4.Bút mực");
    }

    public void themSach(Scanner sc, ArrayList<Item> items)
    {
        System.out.println("Nhập tên sách: ");
        String ten = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        String giaBan = sc.nextLine();
        System.out.println("Nhập thương hiệu: ");
        String thuongHieu = sc.nextLine();
        System.out.println("Nhập thể loại: ");
        String theLoai = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();
        System.out.println("Nhập tên nhà xuất bản: ");
        String nhaXuatBan = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        String namXuatBan = sc.nextLine();
        System.out.println("Nhập ngôn ngữ: ");
        String ngonNgu = sc.nextLine();
        Book newBook = new Book(ten, giaBan, theLoai, tacGia, thuongHieu, nhaXuatBan, namXuatBan, ngonNgu);
        items.add(newBook);
        System.out.println("Sách mới đã được thêm!!");
    }

    public void themVo(Scanner sc, ArrayList<Item> items)
    {
        System.out.println("Nhập tên vở: ");
        String ten = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        String giaBan = sc.nextLine();
        System.out.println("Nhập số trang: ");
        String soTrang = sc.nextLine();
        System.out.println("Nhập tên thương hiệu: ");
        String thuongHieu = sc.nextLine();
        System.out.println("Nhập loại vở (vở kẻ ô / vở kẻ ngang / vở kẻ caro): ");
        String loaiVo = sc.nextLine();
        System.out.println("Nhập màu sắc: ");
        String mauSac = sc.nextLine();
        System.out.println("Nhập chất liệu giấy (giấy trắng / giấy màu): ");
        String chatLieu = sc.nextLine();
        System.out.println("Nhập kích thước (A4 / A5 / A6): ");
        String kichThuoc = sc.nextLine();
        Notebook newNoteBook = new Notebook(ten, giaBan, soTrang, thuongHieu, loaiVo, mauSac, chatLieu, kichThuoc);
        items.add(newNoteBook);
        System.out.println("Vở mới đã được thêm!!");
    }

    public void themButMuc(Scanner sc, ArrayList<Item> items)
    {
        System.out.println("Nhập tên bút: ");
        String ten = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        String giaBan = sc.nextLine();
        System.out.println("Nhập tên thương hiệu: ");
        String thuongHieu = sc.nextLine();
        System.out.println("Nhập màu sắc: ");
        String mauSac = sc.nextLine();
        System.out.println("Nhập chất liệu (nhựa / kim loại): ");
        String chatLieu = sc.nextLine();
        System.out.println("Nhập loại mực (mực dầu / mực nước): ");
        String loaiMuc = sc.nextLine();
        System.out.println("Nhập độ mịn (đơn vị mm): ");
        String doMin = sc.nextLine() + "mm";
        Pen newPen = new Pen(ten, giaBan, thuongHieu, mauSac, chatLieu, loaiMuc, doMin);
        items.add(newPen);
        System.out.println("Bút mực mới đã được thêm!!");
    }

    public void themButChi(Scanner sc, ArrayList<Item> items)
    {
        System.out.println("Nhập tên bút: ");
        String ten = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        String giaBan = sc.nextLine();
        System.out.println("Nhập tên thương hiệu: ");
        String thuongHieu = sc.nextLine();
        System.out.println("Nhập màu sắc: ");
        String mauSac = sc.nextLine();
        System.out.println("Nhập chất liệu (gỗ / nhựa): ");
        String chatLieu = sc.nextLine();
        System.out.println("Nhập độ cứng (HB / 2B / 3B / 4B / 5B / 6B / 7B / 8B / 9B / 10B): ");
        String doCung = sc.nextLine();
        Pencil newPencil = new Pencil(ten, giaBan, thuongHieu, mauSac, chatLieu, doCung);
        items.add(newPencil);
        System.out.println("Bút chì mới đã được thêm!!");
    }

//    void xoaSach(Scanner sc, ArrayList<Book> books)
//    {
//        for(int i = 0; i < Book.soLuong; i++)
//        {
//            System.out.printf("%d.%s %s %s %s %s %s %s\n",i+1, books.get(i).getTen(), books.get(i).getGiaBan(),
//                    books.get(i).getTheLoai(), books.get(i).getTacGia(), books.get(i).getNhaXuatBan(),
//                    books.get(i).getNamXuatBan(), books.get(i).getNgonNgu());
//        }
//        System.out.println("Nhap id sach muon xoa:");
//        int id = sc.nextInt();
//        books.remove(id-1);
//        Book.soLuong -= 1;
//        System.out.println("Sach da duoc xoa!!");
//        System.out.println();
//    }
//
//    void xoaVo(Scanner sc, ArrayList<Notebook> notes)
//    {
//        for(int i = 0; i < Book.soLuong; i++)
//        {
//            System.out.printf("%d.%s %s %s %s %s %s %s\n",i+1, books.get(i).getTen(), books.get(i).getGiaBan(),
//                    books.get(i).getTheLoai(), books.get(i).getTacGia(), books.get(i).getNhaXuatBan(),
//                    books.get(i).getNamXuatBan(), books.get(i).getNgonNgu());
//        }
//        System.out.println("Nhap id sach muon xoa:");
//        int id = sc.nextInt();
//        books.remove(id-1);
//        Book.soLuong -= 1;
//        System.out.println("Sach da duoc xoa!!");
//        System.out.println();
//    }
//
//    void suaSach(Scanner sc, ArrayList<Book> books)
//    {
//        for(int i = 0; i < Book.soLuong; i++)
//        {
//            System.out.printf("%d.%s %s %s %s\n",i+1, books.get(i).getkeyWord(), books.get(i).getTacGia(),
//                    books.get(i).getTheLoai(), books.get(i).getNgayXuatBan());
//        }
//        System.out.println("Nhap so thu tu sach muon sua:");
//        int id = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Nhap tieu de:");
//        String tieuDe = sc.nextLine();
//        System.out.println("Nhap ten tac gia:");
//        String tacGia = sc.nextLine();
//        System.out.println("Nhap the loai:");
//        String theLoai = sc.nextLine();
//        System.out.println("Nhap ngay xuat ban:");
//        String ngayXuatBan = sc.nextLine();
//        books.get(id-1).setTieuDe(tieuDe);
//        books.get(id-1).setTacGia(tacGia);
//        books.get(id-1).setTheLoai(theLoai);
//        books.get(id-1).setNgayXuatBan(ngayXuatBan);
//        System.out.println("Sach #" + id + " da duoc cap nhat!!");
//        System.out.println();
//    }


}
