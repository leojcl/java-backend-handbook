## 1. Code Examples

**1.1 Khởi tạo và làm việc cơ bản với Git**

![Đây là vòng đời cơ bản nhất của git: Theo dõi thay đổi - statge code - ghi lại lịch sử](attachment:e6d38888-ee14-4219-8871-7bf0568578da:image.png)

Đây là vòng đời cơ bản nhất của git: Theo dõi thay đổi - statge code - ghi lại lịch sử

**1.2 Làm việc với branch**

![Chuyển branch hoặc tạo và chuyển đến branch vừa tạo:
được dùng để phát triển độc lập, tránh ảnh hưởng trực tiếp đến code chính.](attachment:f4984e39-726f-4549-8734-dd16336488cc:image.png)

Chuyển branch hoặc tạo và chuyển đến branch vừa tạo:
được dùng để phát triển độc lập, tránh ảnh hưởng trực tiếp đến code chính.

**1.3 Merge branch**

![Merge giúp kết hợp lịch sử của hai nhánh, giữ lại toàn bộ commit tree. Đứng ở nhánh của bạn và dùng: git merge ‘nhánh cần merge vào nhánh của bạn’](attachment:3a36dba7-8543-43ee-ba49-20918fe16b70:image.png)

Merge giúp kết hợp lịch sử của hai nhánh, giữ lại toàn bộ commit tree. Đứng ở nhánh của bạn và dùng: git merge ‘nhánh cần merge vào nhánh của bạn’

**1.4 Rebase branch**

![Rebase sẽ giúp lịch sử commit gọn gàng hơn, sẽ xóa lịch sử commit trước đó của bạn](attachment:47250a02-5ec0-4594-abea-d43eae364bb9:image.png)

Rebase sẽ giúp lịch sử commit gọn gàng hơn, sẽ xóa lịch sử commit trước đó của bạn

**1.5 Pull Request**

![image.png](attachment:3f9dbf6f-b5d3-4efa-8eaa-d1067b27a1b0:image.png)

## *2. Core Concepts*

**2.1 Merge vs Rebase (bản chất khác nhau)**

![Nguyên tắc vàng là: Dùng Rebase ở local branch, Merge ở shared branch](attachment:4f4c9b10-d3b2-453d-9ba1-617ee715d395:image.png)

Nguyên tắc vàng là: Dùng Rebase ở local branch, Merge ở shared branch

**2.2 Git diff, git log & git blame (Debug sống còn)**

![Giúp so sánh code trước khi commit ](attachment:81968196-7918-4770-9f9c-5299dbea980c:image.png)

Giúp so sánh code trước khi commit

![Sẽ giúp bạn hiểu lịch sử, merge, rebase](attachment:aa7ada53-b94d-4424-8ace-80cd4e74145c:image.png)

Sẽ giúp bạn hiểu lịch sử, merge, rebase

![Check được ai sửa code của file ](attachment:501c786d-49b0-49d9-9cac-3b170e1809a3:image.png)

Check được ai sửa code của file

**2.3 Reset vs Revert vs Checkout (rất hay nhầm)**

![Hãy nhớ: public branch thì dùng revert, không được dùng reset](attachment:207c7e05-b7aa-4571-8ecc-f6a45eff949e:image.png)

Hãy nhớ: public branch thì dùng revert, không được dùng reset

**2.4 Stash sẽ cứu nguy khi bạn phải đổi việc gấp**

![Chuyển nhánh nhanh mà không cần commit dở](attachment:8238b72a-e32c-4423-b2e8-013653f79cef:image.png)

Chuyển nhánh nhanh mà không cần commit dở

**2.5 Remote & Tracking Branches**

![Nhớ: pull = fetch + merge. Dùng git fetch sẽ an toàn hơn khi chỉ muốn xem trước](attachment:6ae4b117-3835-4843-80ce-6097c5f68c8c:image.png)

Nhớ: pull = fetch + merge. Dùng git fetch sẽ an toàn hơn khi chỉ muốn xem trước

## *3. Real-World Scenarios*

### Scenario 1: production có bug trong khi team đang phát triển feature thì bạn sẽ làm gi ?

- Tạo 1 hotfix/xxx từ main
- Fix bug
- Merge lại main và các branch liên quan

### Scenario 2: Merge nhầm, làm hỏng `main` / `develop`

Một dev merge nhầm branch hoặc code chưa ổn lên `main`, CI đỏ, production build fail, QA kêu gào.

Cách xử lý:

- Nếu commit mới chưa deploy và branch là public → dùng revert, không được dùng reset

![image.png](attachment:6fe21708-8233-492a-9480-00bd71e1b566:image.png)

- Nếu commit mới đã deploy nhưng lỗi thì cũng vẫn dùng revert → tạo commit ngược
- Tuyệt đối không được dùng git reset —hard, git push —force vì trên branch đang có nhiều người dùng dễ làm toang lịch sử.

### Scenario 3: Nếu bạn lỡ dùng git reset --hard

Cách xử lý:

![Bạn có thể dùng reflog để tìm lại commit](attachment:e37153c7-8cc8-481c-a451-7f3e0c4586f0:image.png)

Bạn có thể dùng reflog để tìm lại commit

### Scenario 4: History quá “bẩn”, khó blame – khó debug

Bạn dùng commit kiểu: fix bug, update, test,… và commit gộp đủ thứ → sau này dùng git blame lại không hiểu gì

Cách xử lý: Hãy áp dụng Commit Message Convention:

![1 commit = 1 ý nghĩa rõ ràng và chỉ 1](attachment:bf0ccab8-94a2-4be1-bcef-ea94f76bd220:image.png)

1 commit = 1 ý nghĩa rõ ràng và chỉ 1

## *4. Interview Questions*

Để quản lý source code sạch sẽ và hiệu quả, không chỉ cho bản thân mà còn cho người khác xem, đây là kiến thức bắt buộc 1 java developer cần phải có. Vì vậy → “No Interview questions”