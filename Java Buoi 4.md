##Tính kế thừa (Inheritance)
Tính chất đầu tiên trong 4 tính chất OOP Java chính là tính kế thừa. Tính kế thừa cho phép xây dựng các lớp mới trên cơ sở của lớp hiện có. Lớp mới (con) sẽ được kế thừa các thuộc tính và phương thức của lớp cha. Nó tương tự một đứa trẻ sẽ kế thừa các đặc điểm như màu da, màu tóc, cách nói chuyện…của cha mẹ.

Việc sử dụng kế thừa giúp tiết kiệm thời gian và nỗ lực trong việc lập trình và giảm thiểu lỗi lặp lại. Nó cũng giúp tăng tính tái sử dụng của mã lập trình.

###Ví dụ
```Java
    class Animal {
        // các thuộc tính và phương thức của lớp Animal
        }

    class Dog extends Animal {
        // các thuộc tính và phương thức của lớp Dog
        }
```
Trong Java, để kế thừa các thuộc tính và phương thức của một lớp cha, chúng ta sử dụng từ khóa `extends` khi khai báo lớp con

##Tính đa hình (Polymorphism)
Tính đa hình (Polymorphism) là khả năng của đối tượng (object) thể hiện các hành vi khác nhau khi được gọi bằng cùng một phương thức. Nó cho phép các đối tượng của các lớp khác nhau có thể đáp ứng một cách khác nhau với cùng một phương thức. Ví dụ, một người với việc di chuyển thì họ có thể lựa chọn đi bộ, chạy hay ngồi phương tiện.

Tính đa hình giúp làm giảm sự phức tạp của mã lập trình, tăng tính linh hoạt của chương trình và giảm thiểu lỗi lặp lại.

###Tính đa hình thể hiện trong Java
Trong Java, tính đa hình được thể hiện thông qua việc sử dụng phương thức ghi đè `override` và nạp chồng `overload`:

Trong ghi đè (override), lớp con thay đổi lại một phương thức đã được định nghĩa trong lớp cha. Khi một đối tượng của lớp con gọi phương thức đó, nó sẽ thực thi phương thức mới của lớp con thay vì phương thức cũ của lớp cha.
Trong nạp chồng (overload), một phương thức duy nhất có thể thực hiện các chức năng khác nhau tùy thuộc vào ngữ cảnh trong đó nó được gọi.
Sử dụng đối tượng đa hình (Polymorphic Objects), biến thuộc lớp cha có thể tham chiếu đến đối tượng của lớp con, khiến biến thuộc lớp cha cũng có thể đáp ứng với các phương thức của lớp con.

**Ví dụ**:
```Java
class Animal {
    public void makeSound() {
    System.out.println(“The animal makes sound”);
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
    System.out.println(“The dog barks”);
    super.makeSound(); // gọi phương thức makeSound() của lớp cha
    }
}

Output: The dog barks
        The animal makes sound
```

##Tính đóng gói (Encapsulation)
Tính đóng gói (Encapsulation) cho phép chúng ta giấu thông tin của đối tượng và chỉ cho phép các phương thức được định nghĩa trong lớp đó mới có thể truy cập và sử dụng các thuộc tính và phương thức đó. Nó giúp che dấu và bảo vệ dữ liệu bên trong đối tượng khỏi truy cập trực tiếp từ bên ngoài. Điều này giúp giảm thiểu sự phụ thuộc giữa các đối tượng và tăng tính bảo mật cho chương trình.

Ví dụ, mỗi người đều có thông tin cá nhân và để tránh sự xâm nhập của người không liên quan, chúng ta sẽ đóng gói thông tin của mình vào một nơi và bảo mật bằng cách đặt mật khẩu.

###Tính đóng gói thể hiện trong Java
Trong Java, tính đóng gói được thực hiện bằng cách sử dụng các từ khóa truy cập `access modifiers`, điều khiển khả năng nhìn thấy của biến và phương thức trong một lớp. Ba từ khóa truy cập trong Java bao gồm:

- **Public**: Các biến và phương thức công khai (public) có thể truy cập từ bất kỳ đâu, bao gồm bên ngoài lớp.
- **Private**: Các biến và phương thức riêng tư (private) chỉ có thể truy cập trong lớp mà chúng được định nghĩa.
- **Protected**: Các biến và phương thức được bảo vệ (protected) có thể truy cập được trong cùng lớp và các lớp con của nó.

**Ví dụ**
```Java
class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
```