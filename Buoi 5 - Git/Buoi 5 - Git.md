# Java Buổi 5:

## Version Control
Trong kỹ nghệ phần mềm, một hệ thống quản lý phiên bản (còn viết là VCS - version control systems) là một hệ thống lưu giữ các phiên bản của mã nguồn của sản phẩm phần mềm, giúp các lập trình viên có thể dễ dàng lấy lại phiên bản mong muốn.

VCS lưu trữ mọi sự thay đổi trong source code của dự án trong một cơ sở dữ liệu đặc biệt. Chúng ta có thể dễ ràng truy vấn ra được sự thay đổi của source code trong một file tại một thời điểm bất kỳ. Và nếu cần chúng ta có thể dễ dàng đảo ngược source code trong file trở về một thời điểm trước đó

**`VCS dạng tập trung`** thì source code của dự án sẽ được lưu trữ trên một kho tập trụng (hay kho trung tâm) trên một máy chủ. Mỗi lập trình viên muốn tạo ra sự thay đổi cho source code lưu trữ trong kho trung tâm trung (centralized repository) thì họ cần phải thực hiện một công việc trước đó là update source code trên máy tính của họ với kho tập trung trước sau đó mới được thay đổi.

**`VCS dạng phân tán`** thì mỗi lập trình viên sẽ có riêng một kho (repository) của mình và có thể tự do phát triển khác feature và tạo version mới (hay đúng hơn là một commit) mà không cần phải đồng bộ với kho trên server. Điều này sẽ giúp lập trình viên tập trung vào việc hoàn thành feature hay fix bug mà không cần lo về việc phải liên tục update code trên máy tính của họ với code trên server để giảm thiểu xung đột. Việc xử lý xung đột (nếu có) sẽ được thực hiện một lần duy nhất.

## Khái niệm về Git:
### 1. Repository
Gọi tắt là Repo, là nơi chứa tất cả các thông tin cần thiết để duy trì và quản lí các sửa đổi và lịch sử của toàn bộ project.
- **Local repo:** là repository bố trí trên máy local của lập trình viên, dành cho một người dùng sử dụng, có nhiêm vụ đồng bộ hóa với remote repository bằng các lệnh của git.
- **Remote repo:** là repository để chia sẻ giữa nhiều người và bố trí trên server chuyên dụng (VD: GitHub).

### 2. Branch
Đây là thế mạnh của git. Với git, việc quản lý branch - nhánh rất dễ dàng. Mỗi nhánh trong Git gần giống như một workspace. Việc nhảy vào một nhánh để làm việc trong đó tương tự việc chuyển qua workspace mới và cũng có thể quay lại workspace cũ một cách nhanh chóng.

Branch được dùng để phát triển tính năng mới mà không làm ảnh hưởng đến code hiện tại.

### 3. Commit
Đây là lệnh cực kỳ phổ biến và bạn không thể bỏ qua khi tìm hiểu Git là gì. Git commit có tác dụng giúp Git lưu lại một ảnh chụp màn hình/snapshot đối với các thay đổi trong thư mục trong quá trình làm việc với Git. 

Với Git, khi Commit, các thay đổi sẽ được tự động lưu lại và thường nằm trong mục Staging Area. Trong hệ thống cũng sẽ lưu lại tên người chỉnh sửa để người dùng có thể dễ dàng theo dõi. Hệ thống cũng sẽ lưu trữ tên và email của người thực hiện chính sửa. Bạn cũng có thể khôi phục lại các tệp tin và chuyển sang một nhánh khác. 

### 4. Merge
Git Merge là một lệnh dùng để hợp nhất các chi nhánh độc lập thành một nhánh duy nhất trong Git.

Khi sử dụng lệnh hợp nhất trong Git, chỉ có nhánh hiện tại được cập nhật để phản ánh sự hợp nhất, còn nhánh đích sẽ không bị ảnh hưởng. Điều này có nghĩa rằng, Git Merge thường được sử dụng kết hợp với git checkout để chọn nhánh hiện tại và git branch để xóa nhánh nguồn đã lỗi thời.
- Fast Forward Merge
- 3-way Merge

### 5. Pull
Git pull và Git fetch là 2 lệnh có chức năng khá tương tự nhau, đều được sử dụng để download dữ liệu mới từ một Remote repository. Tuy vậy, Git fetch thường được xem như phiên bản an toàn hơn của Git pull.

Git fetch cho phép người dùng tải xuống nội dung từ remote repository mà không làm ảnh hưởng đến trạng thái của local repository. Trong khi đó, lệnh Git pull sẽ thực hiện tải xuống nội dung, đồng thời thay đổi trạng thái của Local repository sao cho phù hợp với nội dung đó. Điều này có thể gây ra hiện tượng xung đột hợp nhất (merge-conflict) trong Git.

Git fetch thường được sử dụng trong trường hợp có nhiều người dùng làm việc trên cùng một nhánh. Còn với Git pull, bạn chỉ nên sử dụng khi chỉ có một mình bạn làm việc trên nhánh và trên một thư mục làm việc sạch (thư mục không có thay đổi đã được cam kết).

### 6.Push
Lệnh git push được sử dụng để đẩy các commit mới ở máy trạm (local repo) lên server (remote repo). Nguồn để đẩy lên là nhánh mà con trỏ HEAD đang trỏ tới (nhánh làm việc).

Một số tham số hay dùng như:

- --all đẩy tất cả các nhánh lên server
- --tags đẩy tất cả các tag lên server
- --delete xóa một nhánh chỉ ra trên server
- -u đẩy và tạo một upstream (luồng upload tương ứng với nhánh của local), hay sử dụng cho lần đầu đẩy lên server

### 7. Clone và Fork
**`Clone`**: câu lệnh trong git, copy repo bất kì về máy (local), phù hợp khi làm việc nhóm, cập nhật được các commit của người khác, và khi upload lên cũng giúp người khác thấy đc luôn.
**`Fork`**: không phải câu lệnh trong git, là chức năng trên github, copy repo về github của mình, phù hợp khi làm việc 1 mình, có thể upload / download, truy cập tùy thích.


## UML là gì? Lí do cần vẽ UML
**`UML (Unified Modeling Language)`** là ngôn ngữ dành cho việc đặc tả, hình dung, xây dựng và làm tài liệu của các hệ thống phần mềm.

UML cung cấp cho người dùng một ngôn ngữ mô hình hoá trực quan sẵn sàng để dùng và có ý nghĩa:

- Cho phép phát triển và trao đổi những mô hình mang nhiều ý nghĩa.
- Cung cấp khả năng mở rộng và chuyên môn hoá để mở rộng những khái niệm cốt lõi.
- Độc lập với ngôn ngữ lập trình chuyên biệt và các tiến trình phát triển.
- Cung cấp nền tảng về sự hiểu biết ngôn ngữ mô hình hoá.
- Khuyến khích và hỗ trợ sự phát triển của các công cụ hướng đối tượng.
- Hỗ trợ những khái niệm phát triển cấp độ cao như collaboration, framework, pattern and component.
- Tích hợp một cách tốt nhất với thực tiễn.

## Class Diagram, Activity Diagram
**Class Diagram** là một loại biểu đồ trong kỹ thuật phần mềm, được sử dụng để **`mô tả cấu trúc và mối quan hệ giữa các lớp trong một hệ thống phần mềm`**. Nó là một phần quan trọng của mô hình hóa phân cấp, hay còn được gọi là UML (Unified Modeling Language), được sử dụng rộng rãi trong việc phát triển phần mềm.

**Activity Diagram** là một mô hình logic dùng để **`mô hình hóa các hoạt động`** trong một quy trình nghiệp vụ, giúp developer, tester hay chính bản thân BA dễ dàng nắm được các hướng đi của hệ thống

