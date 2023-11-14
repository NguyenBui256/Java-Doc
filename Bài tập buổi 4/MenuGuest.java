import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class MenuGuest {

    public void show()
    {
        System.out.println("1.Tìm kiếm item");
        System.out.println("2.Xem danh sách");
        System.out.println(("3.Logout"));
    }

    public void timKiem(Scanner sc, ArrayList<Book> books, ArrayList<Notebook> notes, ArrayList<Pencil> pencils, ArrayList<Pen> pens)
    {
        System.out.println("Nhập từ khóa tìm kiếm:");
        String keyWord = sc.nextLine();
        System.out.println("Chọn chế độ hiển thị:");
        System.out.println("1.Dạng bảng");
        System.out.println("2.Dạng danh sách");
        String option = sc.nextLine();
        if(option.equals("2"))
        {
            System.out.println("Dánh sách sản phẩm tìm kiếm được:");
            System.out.println("-----");
            for (int i = 0; i < Book.soLuong; i++)
            {
                if (       books.get(i).getTen().contains(keyWord)
                        || books.get(i).getGiaBan().contains(keyWord)
                        || books.get(i).getTheLoai().contains(keyWord)
                        || books.get(i).getTacGia().contains(keyWord)
                        || books.get(i).getNhaXuatBan().contains(keyWord)
                        || books.get(i).getNamXuatBan().contains(keyWord)
                        || books.get(i).getNgonNgu().contains(keyWord)
                )
                {
                    books.get(i).show();
                    System.out.println("-----");
                }
            }

            for (int i = 0; i < Notebook.soLuong; i++)
            {
                if (       notes.get(i).getTen().contains(keyWord)
                        || notes.get(i).getGiaBan().contains(keyWord)
                        || notes.get(i).getThuongHieu().contains(keyWord)
                        || notes.get(i).getSoTrang().contains(keyWord)
                        || notes.get(i).getLoaiVo().contains(keyWord)
                        || notes.get(i).getMauSac().contains(keyWord)
                        || notes.get(i).getChatLieu().contains(keyWord)
                        || notes.get(i).getKichThuoc().contains(keyWord)
                )
                {
                    notes.get(i).show();
                    System.out.println("-----");
                }
            }

            for (int i = 0; i < Pen.soLuong; i++)
            {
                if (       pens.get(i).getTen().contains(keyWord)
                        || pens.get(i).getGiaBan().contains(keyWord)
                        || pens.get(i).getThuongHieu().contains(keyWord)
                        || pens.get(i).getMauSac().contains(keyWord)
                        || pens.get(i).getChatLieu().contains(keyWord)
                        || pens.get(i).getLoaiMuc().contains(keyWord)
                        || pens.get(i).getDoMin().contains(keyWord)
                )
                {
                    pens.get(i).show();
                    System.out.println("-----");
                }
            }

            for (int i = 0; i < Pencil.soLuong; i++)
            {
                if (       pencils.get(i).getTen().contains(keyWord)
                        || pencils.get(i).getGiaBan().contains(keyWord)
                        || pencils.get(i).getThuongHieu().contains(keyWord)
                        || pencils.get(i).getMauSac().contains(keyWord)
                        || pencils.get(i).getChatLieu().contains(keyWord)
                        || pencils.get(i).getDoCung().contains(keyWord)
                )
                {
                    pencils.get(i).show();
                    System.out.println("-----");
                }
            }
        }
        else
        {
            List<String> tenCot = new ArrayList<>();
            tenCot.add("Tên sản phẩm"); tenCot.add("Giá bán"); tenCot.add("Thương hiệu"); tenCot.add("Thông tin thêm");
            Table table = new Table(tenCot);
            Vector data = new Vector();

            for (int i = 0; i < Book.soLuong; i++)
            {
                if (       books.get(i).getTen().contains(keyWord)
                        || books.get(i).getGiaBan().contains(keyWord)
                        || books.get(i).getTheLoai().contains(keyWord)
                        || books.get(i).getTacGia().contains(keyWord)
                        || books.get(i).getThuongHieu().contains(keyWord)
                        || books.get(i).getNhaXuatBan().contains(keyWord)
                        || books.get(i).getNamXuatBan().contains(keyWord)
                        || books.get(i).getNgonNgu().contains(keyWord)
                )
                {
                    data.clear();
                    data.add(books.get(i).getTen());
                    data.add(books.get(i).getGiaBan());
                    data.add(books.get(i).getThuongHieu());
                    data.add(books.get(i).getTheLoai());
                    Vector bonus = new Vector();
                    bonus.add("- Tác giả: " +  books.get(i).getTacGia());
                    bonus.add("- Nhà xuất bản: " +  books.get(i).getNhaXuatBan());
                    bonus.add("- Năm xuất bản: " +  books.get(i).getNamXuatBan());
                    bonus.add("- Ngôn ngữ: " +  books.get(i).getNgonNgu());

//                    String bonusInfo = String.format("- Thể loại: %s\n- Tác giả: %s\n- Nhà xuất bản: %s\n- Năm xuất bản: %s\n- Ngôn ngữ: %s\n",
//                            books.get(i).getTheLoai(), books.get(i).getTacGia(), books.get(i).getNhaXuatBan(),
//                            books.get(i).getNamXuatBan(), books.get(i).getNgonNgu());
                    data.add(bonus);
                    table.addData(data);
                }
            }

            for (int i = 0; i < Notebook.soLuong; i++)
            {
                if (       notes.get(i).getTen().contains(keyWord)
                        || notes.get(i).getGiaBan().contains(keyWord)
                        || notes.get(i).getThuongHieu().contains(keyWord)
                        || notes.get(i).getSoTrang().contains(keyWord)
                        || notes.get(i).getLoaiVo().contains(keyWord)
                        || notes.get(i).getMauSac().contains(keyWord)
                        || notes.get(i).getChatLieu().contains(keyWord)
                        || notes.get(i).getKichThuoc().contains(keyWord)
                )
                {
                    data.clear();
                    data.add(notes.get(i).getTen());
                    data.add(notes.get(i).getGiaBan());
                    data.add(notes.get(i).getThuongHieu());
                    String bonusInfo = String.format("- Số trang: %s\n- Loại vở: %s\n- Màu sắc bìa: %s\n- Chất liệu giấy: %s\n- Kích thước: %s\n",
                            notes.get(i).getSoTrang(), notes.get(i).getLoaiVo(), notes.get(i).getMauSac(),
                            notes.get(i).getChatLieu(), notes.get(i).getKichThuoc());
                    data.add(bonusInfo);
                    table.addData(data);
                }
            }

            for (int i = 0; i < Pen.soLuong; i++)
            {
                if (       pens.get(i).getTen().contains(keyWord)
                        || pens.get(i).getGiaBan().contains(keyWord)
                        || pens.get(i).getThuongHieu().contains(keyWord)
                        || pens.get(i).getMauSac().contains(keyWord)
                        || pens.get(i).getChatLieu().contains(keyWord)
                        || pens.get(i).getLoaiMuc().contains(keyWord)
                        || pens.get(i).getDoMin().contains(keyWord)
                )
                {
                    data.clear();
                    data.add(pens.get(i).getTen());
                    data.add(pens.get(i).getGiaBan());
                    data.add(pens.get(i).getThuongHieu());
                    String bonusInfo = String.format("- Màu sắc: %s\n- Chất liệu: %s\n- Loại mực: %s\n- Độ mịn: %s\n",
                            pens.get(i).getMauSac(), pens.get(i).getChatLieu(), pens.get(i).getLoaiMuc(),
                            pens.get(i).getDoMin());
                    data.add(bonusInfo);
                    table.addData(data);
                }
            }

            for (int i = 0; i < Pencil.soLuong; i++)
            {
                if (       pencils.get(i).getTen().contains(keyWord)
                        || pencils.get(i).getGiaBan().contains(keyWord)
                        || pencils.get(i).getThuongHieu().contains(keyWord)
                        || pencils.get(i).getMauSac().contains(keyWord)
                        || pencils.get(i).getChatLieu().contains(keyWord)
                        || pencils.get(i).getDoCung().contains(keyWord)
                )
                {
                    data.clear();
                    data.add(pencils.get(i).getTen());
                    data.add(pencils.get(i).getGiaBan());
                    data.add(pencils.get(i).getThuongHieu());
                    String bonusInfo = String.format("- Màu sắc: %s\n- Chất liệu: %s\n- Độ cứng: %s\n",
                            pencils.get(i).getMauSac(), pencils.get(i).getChatLieu(), pencils.get(i).getDoCung());
                    data.add(bonusInfo);
                    table.addData(data);
                }
            }
            table.printData();
        }
    }

//    public void xemDanhSach(ArrayList<Book> books)
//    {
//        for(int i = 0; i < Book.soLuong; i++)
//        {
//            System.out.printf("%d.%s %s %s %s\n",i+1, books.get(i).getTieuDe(), books.get(i).getTacGia(),
//                    books.get(i).getTheLoai(), books.get(i).getNgayXuatBan());
//        }
//        System.out.println();
//    }
}
