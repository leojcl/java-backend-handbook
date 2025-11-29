## *Code Examples*

## *Core Concepts*

1. **Cách hoạt động của web:**
    - Trước khi vào api & backend, chúng ta cần hiểu Web = Client → HTTP → Server
    1. Client browser/app tạo HTTP request
    2. Request đi qua internet → server
    3. Server xử lý logic → truy cập DB → tạo response
    4. Response trả về cho client thông qua HTTP

   ![image.png](attachment:7ce4ce7b-89a2-4564-9da2-9e61afce836c:image.png)

2. **HTTP là gì ?**
    - HyperText Transfer Protocol → Là giao thức không trạng thái (stateless) dùng để trao đổi dữ liệu giữa client và server
    - Stateless → mỗi request là độc lập
3. **HTTP Request - Response structure**
    - HTTP Request gồm: Method, URL, Header, Body

   ![image.png](attachment:52621b14-bf02-4e56-b54b-8c94b926a27a:image.png)

    - HTTP Response:

   ![image.png](attachment:407e2d2c-48b3-4225-8243-3fde2baf6577:image.png)

4. **HTTP Methods:**
    1. GET: lấy dữ liệu, không có body, idempotent, cache được
    2. POST: tạo mới, có body, không idempotent
    3. PUT: cập nhật toàn bộ resource, idempotent
    4. PATCH: cập nhật 1 phần
    5. DELETE: xóa resource, idempotent
    6. → Idempotent có nghĩa là sau khi thực thi, các kết quả trả về đều giống nhau
5. **HTTP status code:**
    - 200, 201, 204 → OK, Created, No content
    - 301, 302, 304 → Moved permanently, Found, Not Modified(cache) (lưu ý 304, dùng khi client đã cache)
    - 400, 401, 403, 404, 409, 429 → Bad request, Unauthoried, Forbidden, Not found, Conflict, too many request(Lưu ý 409, thường dùng khi trùng dữ liệu hoặc conflict version trong API)
    - 500, 502, 503, 504 → lỗi server, Bad gateway, service unavaible, gateway timeout
6. **URL, query param, path param:**
    1. Path param: GET/users/10

   ![image.png](attachment:ab58c6d7-c37d-4600-af5e-1d9db3ccf6a8:image.png)

   b. Query param: GET/users?page=1&size=20

   ![image.png](attachment:3a60830f-7490-4ac8-8a15-2c7ffc1398e9:image.png)

7. **Các headers quan trọng:**

   ![image.png](attachment:b325bad5-6147-499f-b3c5-87f7f7acaa08:image.png)

8. **Stateless là gì ? tại sao HTTP cần stateless ?**
    - HTTP không lưu trạng thái, mỗi request là độc lập → tức là server không nhớ bạn là ai→ vì làm như vậy server scale dễ hơn, load balancer dễ phân phối và không phụ thuộc vào session
    - Nếu cần ghi nhớ user thì backend sẽ dùng: JWT, Session, Redis cache
9. **HTTPS - SSL/TLS ?**
    - HTTPS = HTTP + SSL/TLS → mã hóa request/response
    - Nếu bạn được hỏi HTTP và HTTPS khác nhau điểm gì, thì bạn có thể trả lời:
        - HTTP: không mã hóa(insecure): tức là dữ liệu đi giữa client và server không được mã hóa, ai nghe lén được đều đọc được nội dung request/response
        - HTTPS: mã hóa an toàn: tức là dùng SSL/TLS để mã hóa toàn bộ dữ liệu, xác thực server có đúng là domain đó không và chống sửa đổi dữ liệu(integrity)
10. **Browser → server → database journey**
    - Đây là luồng đầy đủ bạn cần phải nắm:
        1. User click button → JS sẽ gọi API
        2. Browser gửi HTTP request
        3. Đi qua load balancer
        4. Và vào service backend
        5. Backend xử lý logic
        6. Gọi DB → lấy dữ liệu
        7. Tạo response JSON
        8. trả về cho browser
        9. Browser render UI
11. **CORS**
    - Đây là cơ chế bảo vệ khi browser gọi API khác domain

    ![Đây là lỗi hay xảy ra, nếu gặp bạn hãy dùng @CrossOrigin(”*”)](attachment:a181121f-c23c-4b85-aa13-bc939dc84460:image.png)

    Đây là lỗi hay xảy ra, nếu gặp bạn hãy dùng @CrossOrigin(”*”)


## *Real-World Scenarios*

1. **401 nhưng token hợp lệ ?**
    - Có thể do missing Bearer prefix
    - token expired
    - wrong signature
2. **Nếu nhiều người load api, làm server bị chậm bạn sẽ làm gì ?**
    - Check HTTP keep-alive
    - Caching
    - load test
3. **Phân biệt giữa Authentication và Authorization ?**
    - Nói cách dễ hiểu nhất:
        - Authentication là nó xác thực bạn là ai thông qua:
            - Username/password
            - OTP
            - Token
            - OAuth2 login
        - Authorization là phân quyền bạn được truy cập vào tài nguyên.