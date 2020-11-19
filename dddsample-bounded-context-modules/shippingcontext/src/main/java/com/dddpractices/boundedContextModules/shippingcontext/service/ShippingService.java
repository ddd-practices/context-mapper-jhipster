package com.dddpractices.boundedContextModules.shippingcontext.service;

import com.dddpractices.boundedContextModules.shippingcontext.model.Parcel;
import com.dddpractices.boundedContextModules.shippingcontext.repository.ShippingOrderRepository;
import com.dddpractices.boundedContextModules.sharedkernel.service.ApplicationService;

import java.util.Optional;

public interface ShippingService extends ApplicationService {
    void shipOrder(int orderId);

    void listenToOrderEvents();

    Optional<Parcel> getParcelByOrderId(int orderId);

    void setOrderRepository(ShippingOrderRepository orderRepository);
}
