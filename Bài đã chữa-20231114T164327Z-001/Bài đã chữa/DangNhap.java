import java.util.Scanner;
public class DangNhap {

    public int mode;

    public void show(Scanner sc)
    {
        System.out.println("1.Admin");
        System.out.println("2.Guest");
        System.out.println("3.Ket thuc chuong trinh");
        this.mode = sc.nextInt();
    }
}
