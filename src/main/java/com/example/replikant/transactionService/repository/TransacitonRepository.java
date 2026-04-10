package com.example.replikant.transactionService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.replikant.transactionService.model.Transaction;

public interface TransacitonRepository extends JpaRepository<Transaction, Long> {
    
}
