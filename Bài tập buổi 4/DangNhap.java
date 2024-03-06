import java.util.Scanner;
public class DangNhap {

    public String mode;

    public void show(Scanner sc)
    {
        System.out.println("1.Admin");
        System.out.println("2.Guest");
        System.out.println("3.Kết thúc chương trình");
        this.mode = sc.nextLine();
    }
}
