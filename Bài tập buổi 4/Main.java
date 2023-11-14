import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>(10);
        ArrayList<Pen> pens = new ArrayList<Pen>(10);
        ArrayList<Pencil> pencils = new ArrayList<Pencil>(10);
        ArrayList<Notebook> notes = new ArrayList<Notebook>(10);

        MenuAdmin admin = new MenuAdmin();
        MenuGuest guest = new MenuGuest();
        DangNhap login = new DangNhap();
        String option;
        while(true)
        {
            login.show(sc);
            if (login.mode.equals("1")) {
                System.out.println("Hello Admin!!");
                boolean stopSign = true;
                while (stopSign) {
                    admin.show();
                    option = sc.nextLine();
                    switch (option) {
                        case "1":
                            admin.danhSach();
                            option = sc.nextLine();
                            switch (option) {
                                case "1":
                                    admin.themSach(sc, books);
                                    break;
                                case "2":
                                    admin.themVo(sc, notes);
                                    break;
                                case "3":
                                    admin.themButChi(sc, pencils);
                                    break;
                                case "4":
                                    admin.themButMuc(sc, pens);
                                    break;

                            }
                            break;
//                        case 2:
//                            sc.nextLine();
//                            admin.danhSach();
//                            option = sc.nextInt();
//                            switch (option) {
//                                case 1:
//                                    admin.xoaSach(sc, books);
//                                    break;
//                                case 2:
//                                    admin.xoaVo(sc, notes);
//                                    break;
//                                case 3:
//                                    admin.xoaButChi(sc, pencils);
//                                    break;
//                                case 4:
//                                    admin.xoaButMuc(sc, pens);
//                                    break;
//                            }
//                            break;
//                        case 3:
//                            sc.nextLine();
//                            admin.suaSach(sc, books);
//                            break;
                        case "4":
                            guest.show();
                            option = sc.nextLine();
                            if(option.equals("1"))
                            {
                                guest.timKiem(sc, books, notes, pencils, pens);
                            }
                            else if(option.equals("2"))
                            {
//                                guest.xemDanhSach(books);
                            }
                            else
                            {
                                stopSign = false;
                            }
                            break;
                        case "5":
                            stopSign = false;
                            break;
                    }
                    if(!stopSign) break;
                }

            } else if (login.mode.equals("2")){
                System.out.println("Hello Guest!!");
                boolean stopSign = true;
                while(stopSign)
                {
                    guest.show();
                    option = sc.nextLine();
                    if (option.equals("1")){
                        guest.timKiem(sc, books, notes, pencils, pens);
                    } else if (option.equals("2")) {
//                        guest.xemDanhSach(books);
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