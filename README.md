# JAV203_SD21303


Không cần ôm quá nhiều Dependencies nâng cao, rút gọn thành bộ cơ bản, phù hợp với người mới học Spring Boot trên IntelliJ IDEA.

## 1. Spring Boot MVC

| Dependency           | Công dụng                                                             |
| -------------------- | --------------------------------------------------------------------- |
| Spring Web           | Tạo Controller, xử lý Request và Response, xây dựng ứng dụng web MVC. |
| Thymeleaf            | Kết nối Java với HTML để hiển thị dữ liệu động.                       |
| Spring Data JPA      | Thao tác Database, hỗ trợ CRUD thông qua Repository.                  |
| MS SQL Server Driver | Kết nối ứng dụng với SQL Server.                                      |
| Lombok               | Tự động tạo Getter, Setter, Constructor.                              |
| Spring Boot DevTools | Hỗ trợ tự động restart khi chỉnh sửa code.                            |

## 2. Spring Boot REST API

| Dependency           | Công dụng                                                      |
| -------------------- | -------------------------------------------------------------- |
| Spring Web           | Tạo REST Controller, xử lý GET, POST, PUT, DELETE và trả JSON. |
| Spring Data JPA      | Thao tác Database, hỗ trợ CRUD.                                |
| MS SQL Server Driver | Kết nối với SQL Server.                                        |
| Lombok               | Giảm code Getter, Setter, Constructor.                         |
| Spring Boot DevTools | Hỗ trợ tự động restart ứng dụng.                               |


MVC – Khi tạo project

Nên chọn

- Spring Web
- Thymeleaf
- Spring Data JPA
- MS SQL Server Driver

REST API – Khi tạo project

Nên chọn

- Spring Web
- Spring Data JPA
- MS SQL Server Driver

Lombok và DevTools có thể bổ sung sau. Chưa cần học Spring Security, Kafka, Redis hay các công nghệ nâng cao.

Thứ tự học đề xuất:

1. MVC: Controller → Model → View.
2. Database: Entity → Repository → CRUD.
3. REST API: GET → POST → PUT → DELETE.
4. Kết nối REST API với Database.

Cứ nắm chắc 4 phần này trước đã. Chưa cần chạy theo số lượng thư viện.

---

# Error:

<img width="832" height="171" alt="image" src="https://github.com/user-attachments/assets/1074a666-2aba-4afe-969d-34a620890b6e" />

## 1. Thử xử lý theo thứ tự này

Bước 1: Kiểm tra Maven trong IntelliJ

Vào:

`File → Settings → Build, Execution, Deployment → Build Tools → Maven`

Kiểm tra:

- Work offline: bỏ chọn.
- Maven home path: chọn Bundled Maven hoặc Maven cài đặt hợp lệ.
- User settings file: kiểm tra có đang trỏ tới file `settings.xml` bất thường không.

Bước 2: Reload Maven

1. Mở cửa sổ Maven bên phải IntelliJ.
2. Chọn biểu tượng Reload All Maven Projects.
3. Chờ Maven tải lại dependencies.

Bước 3: Ép Maven tải lại dependency

Mở Terminal tại thư mục chứa `pom.xml`, chạy:

```
mvn -U clean install
```

Tham số `-U` yêu cầu Maven kiểm tra và cập nhật lại các dependency bị thiếu hoặc cache lỗi.

## 2. Nếu vẫn lỗi

Kiểm tra phiên bản Maven bằng:

```
mvn -v
```

