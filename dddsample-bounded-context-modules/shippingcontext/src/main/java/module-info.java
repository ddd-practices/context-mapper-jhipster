module com.dddpractices.boundedContextModules.shippingcontext {
    requires com.dddpractices.boundedContextModules.sharedkernel;
    exports com.dddpractices.boundedContextModules.shippingcontext.service;
    exports com.dddpractices.boundedContextModules.shippingcontext.model;
    exports com.dddpractices.boundedContextModules.shippingcontext.repository;
    provides com.dddpractices.boundedContextModules.shippingcontext.service.ShippingService
      with com.dddpractices.boundedContextModules.shippingcontext.service.ParcelShippingService;
}
