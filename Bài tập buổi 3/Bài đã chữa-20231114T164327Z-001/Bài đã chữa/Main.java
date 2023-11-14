import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>(50);
        MenuAdmin admin = new MenuAdmin();
        MenuGuest guest = new MenuGuest();
        DangNhap login = new DangNhap();
        int option;
        while(true)
        {
            login.show(sc);
            if (login.mode == 1) {
                System.out.println("Hello Admin!!");
                boolean stopSign = true;
                while (stopSign) {
                    admin.show();
                    option = sc.nextInt();
                    String tieuDe, tacGia, theLoai, ngayXuatBan;
                    switch (option) {
                        case 1:
                            sc.nextLine();
                            admin.themSach(sc, books);
                            break;
                        case 2:
                            sc.nextLine();
                            admin.xoaSach(sc, books);
                            break;
                        case 3:
                            sc.nextLine();
                            admin.suaSach(sc, books);
                            break;
                        case 4:
                            guest.show();
                            option = sc.nextInt();
                            if(option == 1)
                            {
                                sc.nextLine();
                                guest.timKiemSach(sc, books);
                            }
                            else if(option == 2)
                            {
                                guest.xemDanhSach(books);
                            }
                            else
                            {
                                stopSign = false;
                            }
                            break;
                        case 5:
                            stopSign = false;
                            break;
                    }
                    if(!stopSign) break;
                }

            } else if (login.mode == 2){
                System.out.println("Hello Guest!!");
                boolean stopSign = true;
                while(stopSign)
                {
                    guest.show();
                    option = sc.nextInt();
                    sc.nextLine();
                    if (option == 1) {
                        guest.timKiemSach(sc, books);
                    } else if (option == 2) {
                        guest.xemDanhSach(books);
                    } else
                    {
                        stopSign = false;
                    }
                }
            }
            else
            {
                System.out.println("Goodbye!!!");
                return;
            }
        }
    }
}