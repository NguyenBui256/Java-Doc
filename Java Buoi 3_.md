#Java Buổi 3:
  
##Cách Java lưu trữ dữ liệu
  
Khi một chương trình Java được thực thi, nó sẽ yêu cầu hệ điều hành cấp phát một không gian trên bộ nhớ để lưu trữ toàn bộ dữ liệu và thông tin của nó.
  
Sau đó, nó sẽ chia vùng không gian đó thành 4 vùng nhớ (memory segment) để lưu trữ.
  
![](ScreenShot_20231107193136.png )
  
- **Vùng nhớ Stack** (dùng để lưu trữ tham số và các biến local).
- **Vùng nhớ Heap** (dùng để lưu trữ các đối tượng sau khi khởi tạo bằng từ khóa new và các biến static).
  
Trong java kiểu `dữ liệu nguyên thuỷ(primitives)` được lưu trữ với giá trị thật của chúng trong khi các kiểu dữ liệu `non-primitives` lưu trữ dưới dạng biến tham chiếu đến object thật được lưu trữ trong heap memory. Cả 2 loại (giá trị của kiểu dữ liệu nguyên thuỷ và tham chiếu) này đều được lưu trữ trong `Stack` memory.
  
###Wrapper, Autoboxing, Unboxing
- **Lớp Wrapper** trong Java cung cấp cơ chế cho phép chuyển đổi giữa kiểu dữ liệu nguyên thủy và kiểu đối tượng. Đây là một khía cạnh quan trọng của Lập Trình Hướng Đối Tượng (OOP) trong Java.
- **Autoboxing** là quá trình mà trình biên dịch của Java tự động chuyển đổi giữa kiểu dữ liệu cơ bản (Primitive type) về đối tượng tương ứng với lớp (Wrapper class) của kiểu dữ liệu đó. Và ngược lại là **Unboxing**.
  
###super / this keyword
**super**: gọi đến lớp cha.
**this**: gọi đến lớp con (lớp hiện tại).
  
###Garbage Collector
Garbage Collectors (dưới đây sẽ gọi tắt là GC) được định nghĩa như là một quá trình tự động thực thi nhiệm vụ quản lý bộ nhớ.
  
Chúng ta có 2 vùng nhớ là vùng nhớ `Stack` (dùng để lưu trữ tham số và các biến local) và vùng nhớ `Heap` (dùng để lưu trữ các đối tượng sau khi khởi tạo bằng từ khóa new và các biến static). Bộ nhớ Heap là bộ nhớ cần dọn dẹp nhất vì các Object không cần dùng nữa phải được xóa bỏ để giải phóng bộ nhớ.
  
Trong C++, sau khi khởi tạo một Object, các lập trình viên phải chủ động xóa vùng nhớ của Object bằng câu lệnh **`delete`**, nếu như không thực hiện việc này thì sẽ dẫn đến rò rỉ vùng nhớ. Với Garbage Collectors, lập trình viên Java sẽ không cần quan tâm đến việc xóa các Object mỗi lần ra khỏi hàm hay không còn dùng nữa. Tuy nhiên, đánh đổi lại việc đó là hiệu suất của chương trình sẽ bị giảm đáng kể.    
  
###Java luôn truyền tham trị, không truyền tham chiếu
  
Các tham số trong java luôn được truyền dưới dạng `pass-by-value`. Trong quá trình gọi hàm, một bản sao các tham số đầu vào sẽ được tạo ra và lưu vào stack memory cho dù chúng là giá trị primitives hay tham chiếu(reference).
  
`Các biến thuộc kiểu dữ liệu nguyên thuỷ` có bản sao chép của chúng chỉ tồn tại trong quá trình method đó được thực thi, sau khi method thực thi hoàn thành chúng sẽ bị xoá ra khởi stack, `không ảnh hưởng trực tiếp đến biến ban đầu`.
  
`Các biến reference` được sao chép ra theo cơ chế pass-by-value lại có `cùng địa chỉ` đến object trong vùng nhớ heap làm cho các thao tác trên biến reference sẽ `ảnh hưởng trực tiếp đến object ban đầu`.
  
  
  