import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuGuest {

    public void show()
    {
        System.out.println("1.Tim kiem sach");
        System.out.println("2.Xem danh sach");
        System.out.println(("3.Logout"));
    }

    public void timKiemSach(Scanner sc, ArrayList<Book> books)
    {
        System.out.println("Nhap tieu de:");
        String tieuDe = sc.nextLine();
        System.out.println("Nhap ten tac gia:");
        String tacGia = sc.nextLine();
        System.out.println("Nhap the loai:");
        String theLoai = sc.nextLine();
        System.out.println("Nhap ngay xuat ban:");
        String ngayXuatBan = sc.nextLine();
        boolean timThay = false;
        for (int i = 0; i < Book.soLuong; i++) {
            if (books.get(i).getTieuDe().equals(tieuDe) && books.get(i).getTacGia().equals(tacGia)
                    && books.get(i).getTheLoai().equals(theLoai) && books.get(i).getNgayXuatBan().equals(ngayXuatBan)) {
                timThay = true;
                break;
            }
        }
        if(timThay) System.out.println("Sach da co trong thu vien!!");
        else System.out.println("Khong tim thay!!");
        System.out.println();
    }

    public void xemDanhSach(ArrayList<Book> books)
    {
        for(int i = 0; i < Book.soLuong; i++)
        {
            System.out.printf("%d.%s %s %s %s\n",i+1, books.get(i).getTieuDe(), books.get(i).getTacGia(),
                    books.get(i).getTheLoai(), books.get(i).getNgayXuatBan());
        }
        System.out.println();
    }
}
