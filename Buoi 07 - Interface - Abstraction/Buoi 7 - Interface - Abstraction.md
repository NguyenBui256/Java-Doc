### Java Buổi 7: INTERFACE VÀ TRỪU TƯỢNG

#### 1. Interface là gì
Có thể hiểu đơn giản **Interface (giao diện) là một bản thiết kế cho bất kì class muốn thực hiện nó**, tất cả các phương thức trong Interface đều khai báo không có thân (chỉ có tên - nghĩa là phương thức abstract (thuần ảo)). Lớp triển khai giao diện **(lớp kế thừa) bắt buộc phải định nghĩa lại** (không cần từ khóa override) tất cả các phương thức này.

#### 2. Abstract Class
Là một lớp nhưng không thể tạo ra thực thể. Abstract class có thể chứa hoặc không chứa phương thức abstract – một phương thức chỉ có khai báo mà không chứa cài đặt.

```Java
abstract class Cars
{
	int gas;
	int getGas()
	{
	    return this.gas;
	}

	abstract void run();
}

class Merc extends Cars
{
   void run()
   {
        print("Fast");
   }
}
```

Giải thích: Trong phần đầu tiên của mã, khai báo một lớp trừu tượng Cars. Các phương thức của lớp trừu tượng Cars sẽ được kế thừa bởi các lớp con.

#### 3. Phân biệt Interface và Abstract Class

![alt text](<Screenshot 2024-03-06 233741.png>)

![alt text](<Screenshot 2024-03-06 233836.png>)

#### 4. Tính trừu tượng
 Là một trong bốn thuộc tính cơ bản của OOP. Các tính chất còn lại bao gồm: Tính đóng gói (Encapsulation), Tính kế thừa (Inheritance) và Tính đa hình (Polymorphism).

Hiểu dễ dàng, Tính trừu tượng dùng để chỉ quá trình ẩn việc khai triển thực tế của một phần mềm khỏi người sử dụng. Thay vào đó, lập trình viên chỉ nhấn mạnh vào cách dùng phần mềm.

**Mục đích:** Thông qua Tính trừu tượng, lập trình viên có thể ẩn tất cả dữ liệu hoặc quy trình không liên quan của phần mềm. Đối với người dùng, đấy chỉ là những chi tiết không cần thiết. Từ đó, ta có thể để giảm độ phức tạp & tăng hiệu quả dùng của ứng dụng.

**Ý nghĩa:** Một vài ích lợi của Tính trừu tượng có thể kể đến là:
- Giao diện đơn giản hơn, thân thiện người dùng.
- Các đoạn mã phức tạp bị ẩn đi.
- Nâng cao vấn đề bảo mật, bảo vệ dự liệu không bị lộ.
- Việc bảo trì ứng dụng đơn giản hơn.
- Việc cập nhật hay thay đổi mã sẽ gần như không có khi ảnh hưởng đến Tính trừu tượng.

#### 5. Khi nào dùng interface, khi nào dùng abstract class?

##### Khi nào nên dùng Interface
- Cần cung cấp các chức năng chung cho các lớp không liên quan.
- Cần nhóm các đối tượng dựa trên các hành vi phổ biến.
- Cần sử dụng đa hình vì một lớp có thể thực hiện nhiều interfaces.
- Cần tạo các thành phần (components) được ghép lỏng lẻo, dễ bảo trì và dùng như 1 plugin vì việc implement cho interface được tách biệt với nó.
##### Nếu 1 class implements 2 hay nhiều interface có cùng 1 method?
- Nếu 2 hay nhiều method ấy có tương thích kiểu trả về, ta chỉ cần triển khai 1 lần trong class.
- Nếu 2 hay nhiều method ấy không tương thích kiểu trả về, compile error.

##### Khi nào nên dùng Abstract Class
- Cần sử dụng kế thừa.
- Cần cung cấp các phương thức mặc định cũng như các phương thức phổ biến mà nhiều lớp dẫn xuất có thể thực thi và ghi đè.
- Cần tạo nhiều phiên bản cho các thành phần (components). Bạn có thể thêm các thuộc tính và phương thức vào Abstract Class mà không vi phạm mã và tất cả các lớp kế thừa được tự động cập nhật với thay đổi.