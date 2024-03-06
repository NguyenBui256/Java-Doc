# Buổi 9: Luôn có ngoại lệ, xử lý ngoại lệ
### Exception, checked vs unchecked exception error
Exception là một sự kiện xảy ra trong quá trình thực thi một chương trình Java, nó làm phá vỡ cái flow (luồng xử lý) bình thường của một chương trình, thậm chí chết chương trình. Một ngoại lệ có thể xảy ra với nhiều lý do khác nhau, nó nằm ngoài dự tính của chương trình. Một vài ngoại lệ xảy ra bởi lỗi của người dùng, một số khác bởi lỗi của lập trình viên và số khác nữa đến từ lỗi của nguồn dữ liệu vật lý.
Trong Java có 2 loại exception: checked và unchecked. Tất cả các checked exception được kế thừa từ lớp Exception ngoại trừ lớp RuntimeException. RuntimeException là lớp cơ sở của tất cả các lớp unchecked exception. Đó cũng là dấu hiệu để nhận biết đâu là checked exception và đâu là unchecked exception. Điểm khác biệt giữa các lớp checked và unchecked expcetion chính là thời điểm xác định được expcetion có thể xảy ra.
**Checked exceptions:** Là loại exception xảy ra trong lúc compile time, nó cũng có thể được gọi là compile time exceptions. Loại exception này không thể bỏ qua được trong quá trình compile, bắt buộc ta phải handle nó. Các lớp extends từ lớp Throwable ngoại trừ RuntimeException và Error được gọi là checked exception. Ví dụ: IOException, FileNotFoundException, NoSuchFieldException, ….
**UnChecked exceptions:** Là loại exception xảy ra tại thời điểm thực thi chương trình, nó cũng có thể gọi là runtime exceptions đó là programming bugs, lỗi logic của chương trình… Loại exception này được bỏ qua trong quá trình compile, không bắt buộc ta phải handle nó. Các lớp extends từ RuntimeException được gọi là unchecked exception. Ví dụ: NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, DivideByZeroException, …
### Error:
 Error là những vấn đề nghiêm trọng liên quan đến môi trường thực thi của ứng dụng hoặc hệ thống mà lập trình viên không thể kiểm soát. Nó thường làm chết chương trình. Lớp Error định nghĩa các ngoại lệ mà không thể bắt (catch) từ chương trình. Ví dụ: OutOfMemoryError, VirtualMachineError, and StackOverflowError, …
### Try – Catch
Khối lệnh try trong java được sử dụng để chứa một đoạn code có thế xảy ra một ngoại lệ. Nó phải được khai báo trong phương thức.

![alt text](<Screenshot 2024-03-07 000453-1.png>)

Khối catch trong java được sử dụng để xử lý các Exception. Nó phải được sử dụng sau khối try. Ta có thể sử dụng nhiều khối catch với một khối try duy nhất.
### Finally
Khối lệnh finally trong java luôn được thực thi cho dù có ngoại lệ xảy ra hay không hoặc gặp lệnh return trong khối try.
Khối lệnh finally trong java được khai báo sau khối lệnh try hoặc sau khối lệnh catch.
### Cây phân cấp Exception, throw vs throws
![alt text](<Screenshot 2024-03-07 000514-1.png>)

Class ở mức cao nhất là Throwable
Hai class con trực tiếp là Error và Exception.


**Từ khoá throw** trong java được sử dụng để ném ra một ngoại lệ (exception) cụ thể. Chúng ta có thể ném một trong hai ngoại lệ checked hoặc unchecked trong java bằng từ khóa throw. Từ khóa throw chủ yếu được sử dụng để ném ngoại lệ tùy chỉnh (ngoại lệ do người dùng tự định nghĩa).

**Từ khóa throws** trong java được sử dụng để khai báo một ngoại lệ. Nó thể hiện thông tin cho lập trình viên rằng có thể xảy ra một ngoại lệ, vì vậy nó là tốt hơn cho các lập trình viên để cung cấp các mã xử lý ngoại lệ để duy trì luồng bình thường của chương trình. Exception Handling chủ yếu được sử dụng để xử lý ngoại lệ checked. Nếu xảy ra bất kỳ ngoại lệ unchecked như NullPointerException, đó là lỗi của lập trình viên mà anh ta không thực hiện kiểm tra trước khi code được sử dụng.

![alt text](<Screenshot 2024-03-07 000543.png>)



### Exception tự định nghĩa
![alt text](<Screenshot 2024-03-07 000612.png>)
