package com.santander.fx.domain;

public enum Event {

    TradeRequest(1,EventCategory.TRADE),

    TradeExecuted(2,EventCategory.TRADE),

    TradeCancelRequest(3,EventCategory.TRADE),

    QuoteRequest(4, EventCategory.RFQ),

    Quote(5, EventCategory.RFQ),

    StreamQuoteRequest(6, EventCategory.ESP),

    StreamQuote(7, EventCategory.RFQ);

    private final EventCategory type;
    private final int code;

    Event(int code,EventCategory type){
        this.type = type;
        this.code = code;
    }

    boolean isOf(EventCategory type){
        return this.type == type;
    }

}
