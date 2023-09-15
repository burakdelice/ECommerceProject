package com.bilgeadam.service;


import com.bilgeadam.exception.CartManagerException;
import com.bilgeadam.exception.ErrorType;
import com.bilgeadam.repository.ICartRepository;
import com.bilgeadam.repository.entity.Cart;
import com.bilgeadam.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*
    1-
    Register işlemi yapcaz
    dto alsın dto dönsün
    request dto --> username, email, password
    response dto --> username, id, activationCode
    repodan controllera kadar yazalım


    GetMapping --> veriler nerden geliyor url
    PostMapping --> Body

    2- Login methodu yazalım
        dto alsın eğer veritabnında kayıt varsa true dönsün yoksa false dönsün

    3- Active status --> Boolean dönsün

    */

@Service
public class CartService extends ServiceManager<Cart, Long> {

    private final ICartRepository cartRepository;

    public CartService(ICartRepository cartRepository) {
        super(cartRepository);
        this.cartRepository = cartRepository;
    }

    //TODO user save methoduna bağla
    public Boolean createCart(Cart cart) {
        try {
            save(cart);
            return true;
        } catch (Exception e) {
            throw new CartManagerException(ErrorType.CART_NOT_CREATED);
        }
    }
    
    public void deleteCart(Long id) {
        Cart cart = cartRepository.findById(id).get();
        cartRepository.delete(cart);
    }

    public Cart getCardById(String userId) {
        Optional<Cart> cart = cartRepository.findCartByUserId(userId);
        if(cart.isEmpty()){
            throw new CartManagerException(ErrorType.CART_NOT_FOUND);
        }
        return cart.get();
    }
}
