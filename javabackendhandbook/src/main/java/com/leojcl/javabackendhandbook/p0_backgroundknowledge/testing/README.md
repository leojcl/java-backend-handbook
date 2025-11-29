## *Code Examples*

## *Core Concepts*

![Nhìn vào flow này, bạn biết Test là 1 giai đoạn không thể thiếu trong quá trình phát triển phần mềm](attachment:c1a1052a-0aa2-49f8-9b84-075894a783b0:image.png)

Nhìn vào flow này, bạn biết Test là 1 giai đoạn không thể thiếu trong quá trình phát triển phần mềm

![Đây là các thành phần test chuẩn](attachment:96990411-421e-4c10-91ef-51c86efd754a:image.png)

Đây là các thành phần test chuẩn

1. **Unit Test**
    - Test 1 unit code, thường là 1 method, không liên quan đến DB, network, file,..

   ![Đây là ví dụ dùng JUnit + Mockito](attachment:2c565f44-4cc5-4979-a5d2-462bcc376aea:image.png)

   Đây là ví dụ dùng JUnit + Mockito

2. **Integration Test**
    - Đây là test nhiều layer hoạt động cùng nhau như: Controller → service → Repository

   ![image.png](attachment:bf88f05f-59a4-4e0d-993d-7c4c9f2b847c:image.png)


1. **Mocking**
    - Là giả lập dependency để test logic dễ hơn

   ![image.png](attachment:d4217759-2521-4054-8915-575b84e471b9:image.png)

2. **Test trong Spring boot**

   ![image.png](attachment:112a72cb-218d-4c52-b6c2-b1c858ee1726:image.png)

3. **Các assertions quan trọng bạn cần nhớ:**

   assertEquals(a, b);
   assertTrue(condition);
   assertFalse(condition);
   assertThrows(Exception.class, () ->methodCall());
   assertNotNull(object);


## *Real-World Scenarios*

## *Interview Questions*