package com.dddpractices.boundedContextModules.shippingcontext.repository;

import java.util.Optional;

import com.dddpractices.boundedContextModules.shippingcontext.model.ShippableOrder;

public interface ShippingOrderRepository {
    Optional<ShippableOrder> findShippableOrder(int orderId);
}
