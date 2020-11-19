package com.dddpractices.boundedContextModules.sharedkernel.events;

public interface EventSubscriber {
    <E extends ApplicationEvent> void onEvent(E event);
}
