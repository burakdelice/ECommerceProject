package com.bilgeadam.repository;


import com.bilgeadam.repository.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartRepository extends JpaRepository<Cart, Long> {


}
