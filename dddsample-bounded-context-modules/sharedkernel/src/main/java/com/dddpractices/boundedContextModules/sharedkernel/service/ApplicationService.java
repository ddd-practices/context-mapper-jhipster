package com.dddpractices.boundedContextModules.sharedkernel.service;

import com.dddpractices.boundedContextModules.sharedkernel.events.ApplicationEvent;
import com.dddpractices.boundedContextModules.sharedkernel.events.EventBus;
import com.dddpractices.boundedContextModules.sharedkernel.events.EventSubscriber;

public interface ApplicationService {

    default <E extends ApplicationEvent> void publishEvent(E event) {
        EventBus eventBus = getEventBus();
        if (eventBus != null) {
            eventBus.publish(event);
        }
    }

    default <E extends ApplicationEvent> void subscribe(String eventType, EventSubscriber subscriber) {
        EventBus eventBus = getEventBus();
        if (eventBus != null) {
            eventBus.subscribe(eventType, subscriber);
        }
    }

    default <E extends ApplicationEvent> void unsubscribe(String eventType, EventSubscriber subscriber) {
        EventBus eventBus = getEventBus();
        if (eventBus != null) {
            eventBus.unsubscribe(eventType, subscriber);
        }
    }

    EventBus getEventBus();

    void setEventBus(EventBus eventBus);
}
