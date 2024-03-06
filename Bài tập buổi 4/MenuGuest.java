import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import static java.lang.Math.max;

public class MenuGuest {

    public void show()
    {
        System.out.println("1.Tìm kiếm item");
        System.out.println("2.Xem danh sách");
        System.out.println(("3.Logout"));
    }

    public void timKiem(Scanner sc, ArrayList<Item> items)
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
            for(Item item : items)
            {
                if(item instanceof Book)
                {
                    if
                    (      ((Book) item).getTen().contains(keyWord)
                        || ((Book) item).getGiaBan().contains(keyWord)
                        || ((Book) item).getTheLoai().contains(keyWord)
                        || ((Book) item).getTacGia().contains(keyWord)
                        || ((Book) item).getNhaXuatBan().contains(keyWord)
                        || ((Book) item).getNamXuatBan().contains(keyWord)
                        || ((Book) item).getNgonNgu().contains(keyWord)
                    )
                    {
                        ((Book) item).show();
                        System.out.println("-----");
                    }
                }
                else if(item instanceof Notebook)
                {
                    if (       ((Notebook) item).getTen().contains(keyWord)
                            || ((Notebook) item).getGiaBan().contains(keyWord)
                            || ((Notebook) item).getThuongHieu().contains(keyWord)
                            || ((Notebook) item).getSoTrang().contains(keyWord)
                            || ((Notebook) item).getLoaiVo().contains(keyWord)
                            || ((Notebook) item).getMauSac().contains(keyWord)
                            || ((Notebook) item).getChatLieu().contains(keyWord)
                            || ((Notebook) item).getKichThuoc().contains(keyWord)
                    )
                    {
                        ((Notebook) item).show();
                        System.out.println("-----");
                    }
                }
                else if(item instanceof Pen)
                {
                    if (       ((Pen) item).getTen().contains(keyWord)
                            || ((Pen) item).getGiaBan().contains(keyWord)
                            || ((Pen) item).getThuongHieu().contains(keyWord)
                            || ((Pen) item).getMauSac().contains(keyWord)
                            || ((Pen) item).getChatLieu().contains(keyWord)
                            || ((Pen) item).getLoaiMuc().contains(keyWord)
                            || ((Pen) item).getDoMin().contains(keyWord)
                    )
                    {
                        ((Pen) item).show();
                        System.out.println("-----");
                    }
                }
                else if(item instanceof Pencil)
                {
                    if (       ((Pencil) item).getTen().contains(keyWord)
                            || ((Pencil) item).getGiaBan().contains(keyWord)
                            || ((Pencil) item).getThuongHieu().contains(keyWord)
                            || ((Pencil) item).getMauSac().contains(keyWord)
                            || ((Pencil) item).getChatLieu().contains(keyWord)
                            || ((Pencil) item).getDoCung().contains(keyWord)
                    )
                    {
                        ((Pencil) item).show();
                        System.out.println("-----");
                    }
                }
            }
        }
        else
        {
            int maxLen_Name = "Tên sản phẩm".length(), maxLen_Price = "Giá bán".length(),
                    maxLen_Brand = "Thương hiệu".length(), maxLen_Bonus = "Thông tin thêm".length();
            for(Item item : items)
            {
                if(item.getTen().length() > maxLen_Name) maxLen_Name = item.getTen().length();
                if(item.getGiaBan().length() > maxLen_Price) maxLen_Price = item.getGiaBan().length();
                if(item.getThuongHieu().length() > maxLen_Brand) maxLen_Brand = item.getThuongHieu().length();
                if(item instanceof Book)
                {
                    maxLen_Bonus = max(maxLen_Bonus, (((Book) item).getTheLoai() + "- Thể loại: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Book) item).getTacGia() + "- Tác giả: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Book) item).getNhaXuatBan() + "- Nhà xuất bản: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Book) item).getNamXuatBan() + "- Năm xuất bản: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Book) item).getNgonNgu() + "- Ngôn ngữ: ").length());
                }
                else if(item instanceof Notebook)
                {
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getSoTrang() + "- Số trang: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getLoaiVo() + "- Loại vở: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getMauSac() + "- Màu sắc bìa: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getChatLieu() + "- Chất liệu giấy: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Notebook) item).getKichThuoc() + "- Kích thước: ").length());
                }
                else if(item instanceof Pen)
                {
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getMauSac() + "- Màu sắc: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getChatLieu() + "- Chất liệu: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getLoaiMuc() + "- Loại mực: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pen) item).getDoMin() + "- Độ mịn: ").length());
                }
                else if(item instanceof Pencil)
                {
                    maxLen_Bonus = max(maxLen_Bonus, (((Pencil) item).getMauSac() + "- Màu sắc: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pencil) item).getChatLieu() + "- Chất liệu: ").length());
                    maxLen_Bonus = max(maxLen_Bonus, (((Pencil) item).getDoCung() + "- Độ cứng: ").length());
                }
            }
            System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                    + "%-"+maxLen_Bonus+"s","Tên sản phẩm","Giá bán","Thương hiệu","Thông tin thêm"));
            System.out.println("----------------------------------------------------------------------------");
            for(Item item : items)
            {
                if(item instanceof Book)
                {
                    if
                    (      ((Book) item).getTen().contains(keyWord)
                            || ((Book) item).getGiaBan().contains(keyWord)
                            || ((Book) item).getThuongHieu().contains(keyWord)
                            || ((Book) item).getTheLoai().contains(keyWord)
                            || ((Book) item).getTacGia().contains(keyWord)
                            || ((Book) item).getNhaXuatBan().contains(keyWord)
                            || ((Book) item).getNamXuatBan().contains(keyWord)
                            || ((Book) item).getNgonNgu().contains(keyWord)
                    )
                    {
                        System.out.print(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | ",
                                item.getTen(), item.getGiaBan(), item.getThuongHieu()));
                        System.out.println(String.format( "- Thể loại: %-"+maxLen_Bonus+"s", ((Book) item).getTheLoai() ) );
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Tác giả: %-"+maxLen_Bonus+"s","","","",((Book) item).getTacGia()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Nhà xuất bản: %-"+maxLen_Bonus+"s","","","",((Book) item).getNamXuatBan()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Năm xuất bản: %-"+maxLen_Bonus+"s","","","",((Book) item).getNamXuatBan()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Ngôn ngữ: %-"+maxLen_Bonus+"s","","","",((Book) item).getNgonNgu()));
                        System.out.println("----------------------------------------------------------------------------");
                    }
                }
                else if(item instanceof Notebook)
                {
                    if (       ((Notebook) item).getTen().contains(keyWord)
                            || ((Notebook) item).getGiaBan().contains(keyWord)
                            || ((Notebook) item).getThuongHieu().contains(keyWord)
                            || ((Notebook) item).getSoTrang().contains(keyWord)
                            || ((Notebook) item).getLoaiVo().contains(keyWord)
                            || ((Notebook) item).getMauSac().contains(keyWord)
                            || ((Notebook) item).getChatLieu().contains(keyWord)
                            || ((Notebook) item).getKichThuoc().contains(keyWord)
                    )
                    {
                        System.out.print(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | ",
                                item.getTen(), item.getGiaBan(), item.getThuongHieu()));
                        System.out.println(String.format( "- Số trang: %-"+maxLen_Bonus+"s", ((Notebook) item).getSoTrang() ) );
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Loại vở: %-"+maxLen_Bonus+"s","","","",((Notebook) item).getLoaiVo()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Màu sắc bìa: %-"+maxLen_Bonus+"s","","","",((Notebook) item).getMauSac()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Chất liệu giấy: %-"+maxLen_Bonus+"s","","","",((Notebook) item).getChatLieu()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Kích thước: %-"+maxLen_Bonus+"s","","","",((Notebook) item).getKichThuoc()));
                        System.out.println("----------------------------------------------------------------------------");
                    }
                }
                else if(item instanceof Pen)
                {
                    if (       ((Pen) item).getTen().contains(keyWord)
                            || ((Pen) item).getGiaBan().contains(keyWord)
                            || ((Pen) item).getThuongHieu().contains(keyWord)
                            || ((Pen) item).getMauSac().contains(keyWord)
                            || ((Pen) item).getChatLieu().contains(keyWord)
                            || ((Pen) item).getLoaiMuc().contains(keyWord)
                            || ((Pen) item).getDoMin().contains(keyWord)
                    )
                    {
                        System.out.print(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | ",
                                item.getTen(), item.getGiaBan(), item.getThuongHieu()));
                        System.out.println(String.format( "- Số trang: %-"+maxLen_Bonus+"s", ((Pen) item).getMauSac() ) );
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Chất liệu: %-"+maxLen_Bonus+"s","","","",((Pen) item).getChatLieu()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Loại mực: %-"+maxLen_Bonus+"s","","","",((Pen) item).getLoaiMuc()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Độ mịn: %-"+maxLen_Bonus+"s","","","",((Pen) item).getDoMin()));
                        System.out.println("----------------------------------------------------------------------------");
                    }
                }
                else if(item instanceof Pencil)
                {
                    if (       ((Pencil) item).getTen().contains(keyWord)
                            || ((Pencil) item).getGiaBan().contains(keyWord)
                            || ((Pencil) item).getThuongHieu().contains(keyWord)
                            || ((Pencil) item).getMauSac().contains(keyWord)
                            || ((Pencil) item).getChatLieu().contains(keyWord)
                            || ((Pencil) item).getDoCung().contains(keyWord)
                    )
                    {
                        System.out.print(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | ",
                                item.getTen(), item.getGiaBan(), item.getThuongHieu()));
                        System.out.println(String.format( "- Số trang: %-"+maxLen_Bonus+"s", ((Pencil) item).getMauSac() ) );
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Chất liệu: %-"+maxLen_Bonus+"s","","","",((Pencil) item).getChatLieu()));
                        System.out.println(String.format("%-"+maxLen_Name+"s"+ " | " + "%-"+maxLen_Price+"s" + " | " + "%-"+maxLen_Brand+"s" + " | "
                                + "- Độ cứng: %-"+maxLen_Bonus+"s","","","",((Pencil) item).getDoCung()));
                        System.out.println("----------------------------------------------------------------------------");
                    }
                }
            }
        }
    }

    public void xemDanhSach(ArrayList<Item> items)
    {
        for(Item item : items)
        {
            if(item instanceof Book) ((Book) item).show();
            else if(item instanceof Notebook) ((Notebook) item).show();
            else if(item instanceof Pen) ((Pen) item).show();
            else if(item instanceof Pencil) ((Pencil) item).show();
        }
        System.out.println();
    }
}
