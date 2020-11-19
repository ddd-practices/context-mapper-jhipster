module com.dddpractices.boundedContextModules.infrastructure {
    requires transitive com.dddpractices.boundedContextModules.sharedkernel;
    requires transitive com.dddpractices.boundedContextModules.ordercontext;
    requires transitive com.dddpractices.boundedContextModules.shippingcontext;
    provides com.dddpractices.boundedContextModules.sharedkernel.events.EventBus
      with com.dddpractices.boundedContextModules.infrastructure.events.SimpleEventBus;
    provides com.dddpractices.boundedContextModules.ordercontext.repository.CustomerOrderRepository
      with com.dddpractices.boundedContextModules.infrastructure.db.InMemoryOrderStore;
    provides com.dddpractices.boundedContextModules.shippingcontext.repository.ShippingOrderRepository
      with com.dddpractices.boundedContextModules.infrastructure.db.InMemoryOrderStore;
}
