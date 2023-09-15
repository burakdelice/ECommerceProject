package com.bilgeadam.controller;



import com.bilgeadam.constant.EndPoints;
import com.bilgeadam.repository.entity.Cart;
import com.bilgeadam.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.bilgeadam.constant.EndPoints.*;

@RestController
@RequestMapping(CART)
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping(SAVE)
    public ResponseEntity<Boolean> save(Cart cart){
       return ResponseEntity.ok(cartService.createCart(cart));
    }

    @DeleteMapping(DELETE_BY_ID)
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
         cartService.deleteCart(id);
         return ResponseEntity.ok().build();
    }
    @GetMapping(GET_CART_BY_ID)
    public ResponseEntity<Cart> getCardById(@PathVariable String userId){
        return ResponseEntity.ok(cartService.getCardById(userId));
    }
}
