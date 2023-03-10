package com.shop.ecommerce.service;

import com.shop.ecommerce.domain.entity.Cart;
import com.shop.ecommerce.domain.request.cart.ConfirmCartRequest;
import com.shop.ecommerce.domain.response.cart.CartResponse;

public interface CartService {
    CartResponse addToCart(Long id, Integer amount);

    CartResponse incrementCartItem(Long cartItemId, Integer amount);

    CartResponse decrementCartItem(Long cartItemId, Integer amount);

    CartResponse fetchCart();

    CartResponse removeFromCart(Long id);

    boolean confirmCart(ConfirmCartRequest confirmCartRequest);

    Cart getCart();

    void saveCart(Cart cart);

    void emptyCart();

    Cart calculatePrice(Cart cart);
}
