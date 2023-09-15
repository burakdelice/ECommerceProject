package com.bilgeadam.repository;


import com.bilgeadam.repository.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICartRepository extends JpaRepository<Cart, Long> {


    Optional<Cart> findCartByUserId(String userId);
}
