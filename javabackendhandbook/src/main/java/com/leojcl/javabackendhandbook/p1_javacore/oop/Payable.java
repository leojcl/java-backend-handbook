package com.leojcl.javabackendhandbook.p1_javacore.oop;

// interface định nghĩa hành vi thanh toán
public interface Payable {
    void processPayment(double amount);
    boolean verifyPayment();
}

