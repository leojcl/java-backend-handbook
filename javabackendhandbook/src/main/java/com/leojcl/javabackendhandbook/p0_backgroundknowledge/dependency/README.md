## *Code Examples*

## *Core Concepts*

Build tool trong Java giúp tự động hóa quá trình compile, test, package, quản lý dependency, và deploy ứng dụng. Đây là nền tảng để backend developer làm việc hiệu quả trong bất kỳ project nào.

- Maven: Đây là build tool chuẩn mực của Java
    1. Convention over Configuration: Maven định nghĩa chuẩn chung như cấu trúc thư mục, cách đặt tên, life cycle, login.

  ![Cấu trúc dự án](attachment:f3cebca0-cd57-457d-a6aa-f85567b4a41f:image.png)

  Cấu trúc dự án

  ![Dependency trong Maven](attachment:4b9ebff0-4db9-4ca4-9ad0-6a374feefcec:image.png)

  Dependency trong Maven

    1. Maven life cycle:

       Validate → compile → test → package → verify → install → deploy

- Gradle - Build tool hiện đại, nhanh và linh hoạt
    1. Ưu điểm:
        1. Build nhanh hơn Maven
        2. Cú pháp gọn, dễ đọc
        3. Build caching mạnh
    2. Ví dụ file build.gradle:

       ![image.png](attachment:9c03c0aa-4364-4de5-9983-608d098d31ce:image.png)

- So sánh giữa cả 2:

  ![image.png](attachment:26a0d875-40d9-40e7-b809-01587712ec95:image.png)

    - Spring boot thì dùng Maven là chủ lực, còn Gradle thì phù hợp CI/CD hiện đại và microservice
- Package:

![image.png](attachment:6efbacb2-22f2-400d-9744-3496b264ecff:image.png)

## *Real-World Scenarios*

## *Interview Questions*