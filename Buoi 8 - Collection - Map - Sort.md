## Java Buổi 8
#### 1. Cấu trúc dữ liệu là gì, sử dụng khi nào?
Cấu trúc dữ liệu là một hình thức tổ chức, lưu trữ dữ liệu theo hệ thống và thứ tự để có thể sử dụng tài liệu một cách tối ưu.

Ngày nay, các ứng dụng ngày càng phức tạp và lượng dữ liệu ngày càng lớn với nhiều kiểu đa dạng. Việc này làm xuất hiện 3 vấn đề lớn mà mỗi lập trình viên phải đối mặt:

**Tìm kiếm dữ liệu:** Giả sử có 1 triệu hàng hóa được lưu giữ vào trong kho hàng hóa. Và giả sử có một ứng dụng cần để tìm kiếm một hàng hóa. Thì mỗi khi thực hiện tìm kiếm, ứng dụng này sẽ phải tìm kiếm 1 hàng hóa trong 1 triệu hàng hóa. Khi dữ liệu tăng lên thì việc tìm kiếm sẽ càng trở lên chậm và tốn kém hơn.

**Tốc độ bộ vi xử lý:** Mặc dù bộ vi xử lý có tốc độ rất cao, tuy nhiên nó cũng có giới hạn và khi lượng dữ liệu lên tới hàng tỉ bản ghi thì tốc độ xử lý cũng sẽ không còn được nhanh nữa.

**Đa yêu cầu:** Khi hàng nghìn người dùng cùng thực hiện một phép tính tìm kiếm trên một Web Server thì cho dù Web Server đó có nhanh đến mấy thì việc phải xử lý hàng nghìn phép tính cùng một lúc là thực sự rất khó.

Để xử lý các vấn đề trên, các cấu trúc dữ liệu là một giải pháp tuyệt vời. Dữ liệu có thể được tổ chức trong cấu trúc dữ liệu theo một cách để khi thực hiện tìm kiếm một phần tử nào đó thì dữ liệu yêu cầu sẽ được tìm thấy ngay lập tức.

#### 2. Interface Iterable, Collection -> List, Set, Queue.
Iterator Interface của Collections trong Java cho phép chúng ta truy cập các phần tử của các tập hợp và được sử dụng để duyệt qua các phần tử trong tập hợp như Map, List hoặc Set. Nó giúp dễ dàng truy xuất các phần tử của một tập hợp và thực hiện các thao tác trên mỗi phần tử. Nó có một Interface con là ListIterator.

Iterator Interface cung cấp 4 phương thức có thể được sử dụng để thực hiện các hoạt động khác nhau trên các phần tử của tập hợp.

Phương thức hasNext(): Trả về true nếu tồn tại một phần tử trong tập hợp.
Phương thức next(): Trả về phần tử tiếp theo của tập hợp.
Phương thức remove(): Loại bỏ phần tử cuối cùng được trả về bởi next().
Phương thức forEachRemaining(): Thực hiện hành động được chỉ định cho từng phần tử còn lại của tập hợp.

##### Collection trong Java
![Alt text](image.png)

**Set:** là một collection không thể chứa 2 giá trị trùng lặp. Set được sử dụng để biểu diễn các bộ, chẳng hạn như bộ tú lu khơ, thời khóa biểu của học sinh, các tiến trình đang chạy trên máy tính...
**List:** là một collection có thứ tự (đôi khi còn được gọi là một chuỗi). List có thể chứa các phần tử trùng lặp. Thường có quyền kiểm soát chính xác vị trí các phần tử được chèn vào và có thể truy cập chúng bằng chỉ số (vị trí của chúng).
**Queue (hàng đợi):** là một collection được sử dụng để chứa nhiều phần tử trước khi xử lý. Bên cạnh các thao tác cơ bản của collection, Queue cung cấp các thao tác bổ sung như chèn, lấy ra và kiểm tra. Queue có nguyên tắc sử dụng là FIFO (first-in, first-out - vào trước, ra trước)

#### 3. Interface Map, SortedMap -> HashMap, TreeMap.
Map trong Java là một interface thuộc Java Collections Framework, đại diện cho một cấu trúc dữ liệu dạng map, cho phép lưu trữ và truy cập dữ liệu dưới dạng các cặp key-value (khóa – giá trị).

Trong Java, java.util.Map là interface cơ bản mà các lớp triển khai map phải tuân theo. Các cặp key-value trong map giúp tổ chức và quản lý dữ liệu theo cách hiệu quả và dễ dàng.

##### SortedMap
![Alt text](image-1.png)

SortedMap là một interface vì thế chúng ta không thể khởi tạo trực tiếp mà phải thông qua một implementation của nó, (TreeMap / NavigableMap).

```Java
import java.util.Iterator; 
import java.util.Map; 
import java.util.Set; 
import java.util.SortedMap; 
import java.util.TreeMap; 
  
public class SortedMapExample { 
    public static void main(String[] args) 
    { 
        SortedMap<Integer, String> sm 
            = new TreeMap<Integer, String>(); 

        //Phương thức put(Key, Value) để thêm phần tử vào Map
        sm.put(new Integer(2), "practice"); 
        sm.put(new Integer(3), "quiz"); 
        sm.put(new Integer(4), "contribute"); 

        //Phương thức put(Key, Value) để cập nhật Value cho Key đã có trong Map
        sm.put(new Integer(4), "code"); 
        sm.put(new Integer(1), "deftblog"); 

        //Phương thức remove(Key) xóa phần tử có Key trong Map
        sm.remove(3);


        //Một vài cách Duyệt SortedMap

        //Duyệt xuôi cách 1:
        for(int key : sm.keySet())
        {
            String value = (String)sm.get(key);
            System.out.println("Key: " + key + "  value: " + value);
        }

        //Duyệt xuôi cách 2:
        for(Map.Entry<Integer, String> entry : sm.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + "  value: " + value);
        }
    } 
}
```
Output:
```Java
    Key: 1 value: deftblog
    Key: 2 value: practice
    Key: 4 value: code
```

##### HashMap và TreeMap

**HashMap** là một lớp triển khai của giao diện Map trong Java. Nó sử dụng bảng băm để lưu trữ dữ liệu, cho phép thao tác nhanh chóng với các phần tử của nó. Lưu ý rằng, khi sử dụng Hashmap thì thứ tự các phần thử sẽ không được đảm bảo. Ngoài ra, nó cho phép sử dụng cả key và value là null.

**LinkedHashMap** kế thừa HashMap và triển khai giao diện Map. Nó duy trì thứ tự của các phần tử được thêm vào dựa trên thời điểm chúng được thêm. Nói cách khác, các phần tử được truy cập theo thứ tự chúng được thêm vào. Ngoài ra, LinkedHashmap cho phép sử dụng key và value là null.

**TreeMap** là một lớp triển khai của giao diện Map và được xây dựng dựa trên cây đỏ đen (Red-Black Tree). Nó duy trì thứ tự của các phần tử dựa trên khóa (key) của chúng, nghĩa là các phần tử được sắp xếp theo khóa. Khác với hashmap và linkedhashmap, Treemap chỉ cho phép sử dụng value là null.


##### Sort
Interface Comparable<T> cung cấp một phương thức để sắp xếp list object là int compare(T o1, T o2). Việc chúng ta chỉ là implement interface này.

```Java
public class Student implements Comparator<Student> {
    // Các method và field như ở trên
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
```


Và gọi java.util.Collections.sort để sắp xếp.
```Java
List<Student> students = new ArrayList<>();
students.add(new Student("Jonh", 17));
students.add(new Student("Peter", 19));
students.add(new Student("Henry", 18));
java.util.Collections.sort(students, new Student());
students.forEach(e -> System.out.println(e));
```
Kết quả:
```Java
Student{name='Jonh', age=17}
Student{name='Henry', age=18}
Student{name='Peter', age=19}
```
Sử dụng **anonymous comparator** để so sánh Thay vì implement trực tiếp từ interface Comparator<T>, chúng ta có thể sử dụng anonymous comparator như sau:
```Java
List<Student> students = new ArrayList<>();
students.add(new Student("Jonh", 17));
students.add(new Student("Peter", 19));
students.add(new Student("Henry", 18));
Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
});

students.forEach(e -> System.out.println(e));
```
Kết quả vẫn không thay đổi.

Vẫn sử dụng class Student ở trên, nhưng chúng ta sẽ implements interface ```Comparable<Student>``` và override lại method ```compareTo(Student o)```
```Java
@Override
public int compareTo(Student o) {
    return this.getAge() - o.getAge();
}
```

 




