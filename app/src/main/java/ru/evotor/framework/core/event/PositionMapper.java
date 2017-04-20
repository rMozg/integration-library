package ru.evotor.framework.core.event;

import android.os.Bundle;

import java.math.BigDecimal;

import ru.evotor.framework.receipt.Position;

/**
 * Created by a.kuznetsov on 19/04/2017.
 */

public final class PositionMapper {
    private static final String KEY_PRODUCT_UUID = "productUuid";
    private static final String KEY_PRICE = "price";
    private static final String KEY_QUANTITY = "quantity";
    private static final String KEY_NAME = "name";

    public static Position from(Bundle bundle) {
        String productUuid = bundle.getString(KEY_PRODUCT_UUID);
        String price = bundle.getString(KEY_PRICE);
        String quantity = bundle.getString(KEY_QUANTITY);
        String name = bundle.getString(KEY_NAME);
        return new Position(
                productUuid,
                new BigDecimal(price),
                new BigDecimal(quantity),
                name
        );
    }

    private PositionMapper() {
    }

}