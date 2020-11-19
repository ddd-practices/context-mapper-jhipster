package com.dddpractices.boundedContextModules.ordercontext.repository;

import com.dddpractices.boundedContextModules.ordercontext.model.CustomerOrder;

public interface CustomerOrderRepository {
    void saveCustomerOrder(CustomerOrder order);
}
