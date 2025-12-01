package com.leojcl.javabackendhandbook.p1_javacore.oop;

import lombok.Getter;
import lombok.Setter;

// tính đóng gói ở đây là che giấu dữ liệu, tạo ra phương thưức để truy cập
@Getter
@Setter
public class Customer {

    // khai báo private sẽ không thể truy cập được từ bên ngoài
    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private int creditScore;

    public Customer(String customerId, String name, String email, String phoneNumber, int creditScore) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creditScore = creditScore;
    }

    public void updateCreditScore(int points){
        this.creditScore += points;
        if(this.creditScore > 850){
            this.creditScore = 850;
        }else if(this.creditScore < 300){
            this.creditScore = 300;
        }
    }
    public boolean isEligibleForLoan(){
        return creditScore >= 650;
    }
}
