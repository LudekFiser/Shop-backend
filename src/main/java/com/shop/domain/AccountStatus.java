package com.shop.domain;

public enum AccountStatus {
    PENDING_VERIFICATION,       // created but not yet verified
    ACTIVE,                     //active
    SUSPENDED,                  // temporarily suspended due to violations
    DEACTIVATED,                // deactivated user may have chosen to deactivate it
    BANNED,                     // perma banned due to violations
    CLOSED                      // perma closed, possibly at user request
}
