package com.santander.fx.domain.ver2;

import com.santander.fx.domain.EventCategory;

public enum Rfq {

    QuoteRequest(4,EventCategory.RFQ),

    Quote(5, EventCategory.RFQ),

    StreamQuoteRequest(6, EventCategory.ESP),

    StreamQuote(7, EventCategory.ESP);

    private final EventCategory category;
    private final int code;

    Rfq(int code,EventCategory category){
        this.category = category;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public EventCategory getCategory() {
        return category;
    }
}
