# JAV203_SD21303


Không cần ôm quá nhiều Dependencies nâng cao, rút gọn thành bộ cơ bản, phù hợp với người mới học Spring Boot trên IntelliJ IDEA.

## 1. Spring Boot MVC

| Dependency           | Công dụng                                                             | Bắt buộc?             |
| -------------------- | --------------------------------------------------------------------- | --------------------- |
| Spring Web           | Tạo Controller, xử lý Request và Response, xây dựng ứng dụng web MVC. | Có                    |
| Thymeleaf            | Kết nối Java với HTML để hiển thị dữ liệu động.                       | Có nếu dùng Thymeleaf |
| Spring Data JPA      | Thao tác Database, hỗ trợ CRUD thông qua Repository.                  | Khi học Database      |
| MS SQL Server Driver | Kết nối ứng dụng với SQL Server.                                      | Khi dùng SQL Server   |
| Lombok               | Tự động tạo Getter, Setter, Constructor.                              | Không                 |
| Spring Boot DevTools | Hỗ trợ tự động restart khi chỉnh sửa code.                            | Không                 |

## 2. Spring Boot REST API

| Dependency           | Công dụng                                                      | Bắt buộc?           |
| -------------------- | -------------------------------------------------------------- | ------------------- |
| Spring Web           | Tạo REST Controller, xử lý GET, POST, PUT, DELETE và trả JSON. | Có                  |
| Spring Data JPA      | Thao tác Database, hỗ trợ CRUD.                                | Khi học Database    |
| MS SQL Server Driver | Kết nối với SQL Server.                                        | Khi dùng SQL Server |
| Lombok               | Giảm code Getter, Setter, Constructor.                         | Không               |
| Spring Boot DevTools | Hỗ trợ tự động restart ứng dụng.                               | Không               |


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
