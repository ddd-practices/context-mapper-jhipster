module com.dddpractices.boundedContextModules.mainapp {
    uses com.dddpractices.boundedContextModules.sharedkernel.events.EventBus;
    uses com.dddpractices.boundedContextModules.ordercontext.service.OrderService;
    uses com.dddpractices.boundedContextModules.ordercontext.repository.CustomerOrderRepository;
    uses com.dddpractices.boundedContextModules.shippingcontext.repository.ShippingOrderRepository;
    uses com.dddpractices.boundedContextModules.shippingcontext.service.ShippingService;
    requires transitive com.dddpractices.boundedContextModules.infrastructure;
}