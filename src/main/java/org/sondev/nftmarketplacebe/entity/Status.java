package org.sondev.nftmarketplacebe.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Status {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    BLOCK("BLOCK");

    private final String status;
}
