package com.santander.fx.domain.ver2;

import com.santander.fx.domain.EventCategory;

public enum Trade {

    TradeRequest(1,EventCategory.TRADE),

    TradeExecuted(2,EventCategory.TRADE),

    TradeCancelRequest(3,EventCategory.TRADE);

    private final EventCategory category;
    private final int code;

    Trade(int code,EventCategory category){
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
