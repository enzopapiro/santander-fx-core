package com.santander.fx.domain;

public enum Event {

    TradeRequest(EventCategory.TRADE),

    TradeExecuted(EventCategory.TRADE),

    TradeCancelRequest(EventCategory.TRADE),

    QuoteRequest(EventCategory.RFQ),

    Quote(EventCategory.RFQ),

    StreamQuoteRequest(EventCategory.ESP),

    StreamQuote(EventCategory.RFQ);

    private final EventCategory type;

    Event(EventCategory type){
        this.type = type;
    }

    boolean isOf(EventCategory type){
        return this.type == type;
    }

}
