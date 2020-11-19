package com.dddpractices.boundedContextModules.ordercontext.service;

import com.dddpractices.boundedContextModules.ordercontext.model.CustomerOrder;
import com.dddpractices.boundedContextModules.ordercontext.repository.CustomerOrderRepository;
import com.dddpractices.boundedContextModules.sharedkernel.service.ApplicationService;

public interface OrderService extends ApplicationService {
    void placeOrder(CustomerOrder order);

    void setOrderRepository(CustomerOrderRepository orderRepository);
}
