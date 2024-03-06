# Buổi 10: Xử lí File, Unit test
## 1.Xử lí file trong Java (Binary, Text)
<!-- - Tạo file:
```Java
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```
- Ghi file
```Java
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```
- Đọc file
```Java
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
```
- Lấy info của file
```Java
import java.io.File;  // Import the File class

public class GetFileInfo { 
  public static void main(String[] args) {
    File myObj = new File("filename.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}
```
- Xóa file
```Java
import java.io.File;  // Import the File class

public class DeleteFile {
  public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
``` -->

Về mặt kỹ thuật mà nói thì tất cả các file trong máy tính đều là binary file, hay nói cách khác chỉ là một chuỗi các byte (có giá trị từ 0-255) được lưu trữ trong bộ nhớ. Nhưng nếu một file chỉ chứa các ký tự ASII (từ 0-127) thì ta có thể gọi nó là một text file.

Text file có thể là file XML, CSV hoặt các file chứa thông tin config. Ta có thể ở một text file bằng bất cứ text editor nào là có thể hiểu được nội dụng bên trong file.

Mặt khác binary file có thể là file JPEG hoặc file ZIP. Ta vẫn có thể sử dụng text editor để mở file, nhưng sẽ chỉ thấy các ký hiệu khó hiểu. Trong file ta có thể thấy một vài ký tự ASII, nhưng về tổng thể thì nó chẳng mang ý nghĩa gì cả.

![alt text](<Screenshot 2024-02-26 170814-1.png>)
**Class InputStream** là một class trừu tượng vì vậy bạn không thể khởi tạo đối tượng InputStream thông qua chính class InputStream. Tuy nhiên class này rẽ ra nhiều nhánh thông qua các class con thừa kế nó. Tùy vào các tình huống bạn có thể tạo đối tượng InputStream từ các Constructor của các class con.

**Class OutputStream** là một class trìu tượng vì vậy bạn không thể khởi tạo đối tượng OutputStream thông qua chính class OutputStream .Tuy nhiên class này rẽ ra nhiều nhánh thông qua các class con thừa kế nó và quan trọng .Tùy vào các tình huống bạn có thể tạo đối tượng InputStream từ cấu tử của các class con.

### Đọc ghi file trong java với byte stream
Các chương trình sử dụng Byte Stream để đọc ghi dữ liệu theo từng byte(8bit). Tất cả các class Byte Stream có nguồn gốc từ InputStream và OutputStream.

Sử dụng Byte Stream
Có rất nhiều class Byte Stream, để hình dung Byte Stream hoạt động như thế nào, chúng ta sẽ tập trung vào FileInputStream và FileOutputStream, ví dụ:
```Java
public class CopyFileByte {
    public static void main(String [] args) throws IOException {
      FileInputStream inputStream = null;
      FileOutputStream outputStream = null;
 
      try {
         inputStream = new FileInputStream("inStream.txt");
         outputStream = new FileOutputStream("outStream.txt");
          
         int c;
         while ((c = inputStream.read()) != -1) {
            outputStream.write(c);           
         }
      } finally {
         if (inputStream != null) {
            inputStream.close();
         }
         if (outputStream != null) {
            outputStream.close();
         }
      }         
    }
}
```

### Đọc ghi file trong java với character stream
Byte Stream trong Java được sử dụng để thực hiện input và output của các byte (8 bit), trong khi đó, Character Stream trong Java được sử dụng để thực hiện input và output cho Unicode 16 bit. Tất cả các class Character Stream có nguồn gốc từ Reader và Writer.

Sử dụng Character Stream
Mặc dù có nhiều lớp liên quan tới Character Stream nhưng các lớp thường dùng nhất là FileReader và FileWriter, ví dụ:

```Java
public class CopyFileCharacter {
    public static void main(String [] args) throws IOException {
      FileReader in = null;
      FileWriter out = null;
 
      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
          
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);           
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }         
    }    
}
```
### Buffered Stream
Việc đọc và xuất dữ liệu không sử dụng Buffered Stream được thực hiện trực tiếp dưới quyền điều khiển của hệ điều hành, gây lãng phí thời gian và tài nguyên. Để giảm thiểu những trên, Buffered Streams đã được sinh ra. Buffered Streams được sử dụng để tăng tốc độ hoạt động I/O, bằng cách đơn giản là tạo ra một khoảng nhớ đệm với kích thước cụ thể nào đó. Vì vậy chúng ta không cần phải truy cập vào ổ đĩa cứng khi thực hiện I/O.


## 2.Assertions
**Câu lệnh Assertion** trong Java giúp phát hiện lỗi bằng cách kiểm tra đoạn mã mà người lập trình cho là **đúng**.

**Cú pháp:**
``assert điều_kiện;``

Theo mặc định, các Assertion sẽ bị tắt và bị bỏ qua trong thời gian chạy.
Để bật nó, chúng ta sử dụng câu lệnh sau trên cửa sổ dòng lệnh:

``java -ea:arguments``

Hoặc

``java -enableassertions:arguments``

Khi các Assertion được kích hoạt và điều kiện là đúng, chương trình sẽ thực thi bình thường.

Nhưng nếu điều kiện là false, JVM sẽ đưa ra một lỗi AssertionError và chương trình sẽ dừng ngay lập tức.

Ví dụ:
```Java
class Main {
  public static void main(String args[]) {
    String[] weekends = {"Friday", "Saturday", "Sunday"};
    assert weekends.length == 2;
    System.out.println("There are " + weekends.length + "  weekends in a week");
  }
}
```
Output: 
``There are 3 weekends in a week``

Chúng ta nhận được kết quả ở trên vì chương trình này không có lỗi biên dịch và theo mặc định, các xác nhận(assert) bị vô hiệu hóa.

Sau khi bật xác nhận(assert), chúng ta nhận được kết quả sau:
``Exception in thread "main" java.lang.AssertionError``

**Dạng khác:**
``assert điều_kiện : biểu_thức;``
Trong dạng câu lệnh Assertion này, một biểu thức được chuyển tới hàm tạo của đối tượng AssertionError. Biểu thức này có một giá trị được hiển thị dưới dạng thông báo chi tiết về lỗi nếu điều kiện sai. Thông báo chi tiết được sử dụng để nắm bắt và truyền thông tin về lỗi xác nhận để giúp gỡ lỗi.

**Khi nào nên dùng Assertion**
1. Đoạn Mã không thể thực thi

Đoạn mã không thể thực thi xảy ra khi chúng ta cố gắng chạy chương trình. Sử dụng các Assertion để xác nhận các đoạn mã không thực thi

2. Ghi lại các giả thiết

Để ghi lại các giả thiết, nhiều lập trình viên sử dụng các chú thích trong đoạn mã của họ.

### Unit test
Khi viết ra một đoạn code, ngoài việc để code chạy ra thì chúng ta cần phải đảm bảo nó chạy đúng với ý đồ của mình (đề bài, yêu cầu,…). Mọi người thường dùng cách in từng kết quả ra màn hình và kiểm tra bằng mắt, điều này rất tốn công sức cũng như thời gian. Unit Test ra đời để giúp ta phần nào đơn giản hóa câu chuyện này.

Trong kiểm thử phần mềm có 4 mức độ kiểm thử: Unit test ( kiểm thử mức đơn vị), Intergration test ( kiểm thử tích hợp), System test (kiểm thử hệ thống), Acceptance test (kiểm thử chấp nhận).

Unit test là mức độ kiểm thử nhỏ nhất trong quy trình kiểm thử phần mềm. Unit test kiểm thử các đơn vị nhỏ nhất trong mã nguồn như method, class, module…Do đó Unit test nhằm kiểm tra mã nguồn của các chương trình, các chức năng riêng rẽ hoạt động đúng hay không.

Unit testing được thực hiện bởi lập trình viên.

**Ý nghĩa của Unit test:**
- Giúp sửa bug sớm trong chu trình phát triển sản phẩm và tiết kiệm chi phí
- Giúp các lập trình viên hiểu được nền tảng mã kiểm thử và cho phép họ đưa ra các thay đổi nhanh chóng
- Có thể được sử dụng như các ghi chép về dự án, nếu hiệu quả
- Tái sử dụng code. Kết hợp cả code của bạn và kiểm thử của bạn cho dự án mới. Thay đổi code cho đến khi kiểm thử chạy được

**Thiết kế unit test:**
Mỗi unit test đều được tiết kế theo trình tự sau:
- Thiết lập các điều kiện cần thiết bao gồm khởi tạo các đối tượng, xác định tài nguyên cần thiết, xây dựng các dữ liệu giả.
- Gọi các phương thức cần kiểm tra.
- Kiểm tra sự hoạt động đúng đắn của các phương thức.
- Dọn dẹp tài nguyên sau khi kết thúc kiểm tra.

**JUnit trong Java:**
- Cung cấp các annotation để định nghĩa các phương thức kiểm thử.
- Cung cấp các Assertion để kiểm tra kết quả mong đợi.
- Cung cấp các test runner để thực thi các test script.
- Test case JUnit có thể được chạy tự động.
- Test case JUnit có thể được tổ chức thành các test suite.
- JUnit cho thấy kết quả test một cách trực quan: pass (không có lỗi) là màu xanh và fail (có lỗi) là màu đỏ.