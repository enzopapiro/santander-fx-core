package com.santander.fx.domain;

public enum Event {

    NewOrderSingle(EventCategory.TRADE),

    OrderCancelRequest(EventCategory.TRADE),

    OrderRequest(EventCategory.TRADE),

    OrderExecuted(EventCategory.TRADE),

    QuoteRequest(EventCategory.RFQ),

    Quote(EventCategory.RFQ);

    private final EventCategory type;

    Event(EventCategory type){
        this.type = type;
    }

    boolean isOf(EventCategory type){
        return this.type == type;
    }

}
