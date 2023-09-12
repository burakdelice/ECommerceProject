package com.bilgeadam.controller;



import com.bilgeadam.repository.entity.Cart;
import com.bilgeadam.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PutMapping(UPDATE)
    public ResponseEntity<String> updateCart(@RequestBody Cart cart){
        return ResponseEntity.ok(cartService.updateCart());
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Cart>> findAll(){
        return ResponseEntity.ok(cartService.findAllCarts());
    }
    @DeleteMapping(DELETE_BY_ID)
    public ResponseEntity<Void> deleteById(@RequestParam Long id){
         cartService.deleteCart(id);
         return ResponseEntity.ok().build();
    }

}
