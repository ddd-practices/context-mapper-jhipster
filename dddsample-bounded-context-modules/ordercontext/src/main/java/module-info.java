module com.dddpractices.boundedContextModules.ordercontext {
    requires com.dddpractices.boundedContextModules.sharedkernel;
    exports com.dddpractices.boundedContextModules.ordercontext.service;
    exports com.dddpractices.boundedContextModules.ordercontext.model;
    exports com.dddpractices.boundedContextModules.ordercontext.repository;
    provides com.dddpractices.boundedContextModules.ordercontext.service.OrderService
      with com.dddpractices.boundedContextModules.ordercontext.service.CustomerOrderService;
}