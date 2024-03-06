import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdmin {

    public void show()
    {
        System.out.println("1.Them sach moi");
        System.out.println("2.Xoa sach");
        System.out.println("3.Sua sach");
        System.out.println("4.Cac chuc nang cua khach");
        System.out.println("5.Logout");
    }

    public void themSach(Scanner sc, ArrayList<Book> books)
    {
        System.out.println("Nhap tieu de:");
        String tieuDe = sc.nextLine();
        System.out.println("Nhap ten tac gia:");
        String tacGia = sc.nextLine();
        System.out.println("Nhap the loai:");
        String theLoai = sc.nextLine();
        System.out.println("Nhap ngay xuat ban:");
        String ngayXuatBan = sc.nextLine();
        Book newBook = new Book(tieuDe, tacGia, theLoai, ngayXuatBan);
        books.add(newBook);
        System.out.println("Sach moi da duoc them!!");
        System.out.println();
    }

    void xoaSach(Scanner sc, ArrayList<Book> books)
    {
        for(int i = 0; i < Book.soLuong; i++)
        {
            System.out.printf("%d.%s %s %s %s\n",i+1, books.get(i).getTieuDe(), books.get(i).getTacGia(),
                    books.get(i).getTheLoai(), books.get(i).getNgayXuatBan());
        }
        System.out.println("Nhap id sach muon xoa:");
        int id = sc.nextInt();
        books.remove(id-1);
        System.out.println("Sach da duoc xoa!!");
        System.out.println();
    }

    void suaSach(Scanner sc, ArrayList<Book> books)
    {
        for(int i = 0; i < Book.soLuong; i++)
        {
            System.out.printf("%d.%s %s %s %s\n",i+1, books.get(i).getTieuDe(), books.get(i).getTacGia(),
                    books.get(i).getTheLoai(), books.get(i).getNgayXuatBan());
        }
        System.out.println("Nhap so thu tu sach muon sua:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap tieu de:");
        String tieuDe = sc.nextLine();
        System.out.println("Nhap ten tac gia:");
        String tacGia = sc.nextLine();
        System.out.println("Nhap the loai:");
        String theLoai = sc.nextLine();
        System.out.println("Nhap ngay xuat ban:");
        String ngayXuatBan = sc.nextLine();
        books.get(id-1).setTieuDe(tieuDe);
        books.get(id-1).setTacGia(tacGia);
        books.get(id-1).setTheLoai(theLoai);
        books.get(id-1).setNgayXuatBan(ngayXuatBan);
        System.out.println("Sach #" + id + " da duoc cap nhat!!");
        System.out.println();
    }


}
