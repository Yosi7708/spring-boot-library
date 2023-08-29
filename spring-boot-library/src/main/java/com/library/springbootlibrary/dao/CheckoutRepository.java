package com.library.springbootlibrary.dao;

import com.library.springbootlibrary.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
    Checkout findByUserEmailAndBookId(String userEmail, long bookId);
}
