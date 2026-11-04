package com.example.lab1.repository;
/// Repository không phải nơi xử lý toàn bộ nghiệp vụ. Chỉ chủ yếu phụ trách truy cập dữ liệu.

import com.example.lab1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    /// Thông thường, nếu tự viết DAO bằng JDBC, sẽ phải tự thực hiện khá nhiều công việc:
    /// Viết câu SQL. Mở kết nối. Thực thi truy vấn. Đọc ResultSet. Chuyển dữ liệu thành đối tượng Java. Đóng kết nối và xử lý lỗi....
    /// Giờ không cần tự viết câu SQL SELECT, INSERT, UPDATE, DELETE cho những thao tác cơ bản này.
    /// Spring Data JPA sẽ tự triển khai các phương thức đó, tự cung cấp các thao tác CRUD thông qua cơ chế Repository Proxy.
}
