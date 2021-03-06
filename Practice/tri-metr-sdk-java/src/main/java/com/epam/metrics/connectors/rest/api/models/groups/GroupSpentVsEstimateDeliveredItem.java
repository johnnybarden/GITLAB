package com.epam.metrics.connectors.rest.api.models.groups;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupSpentVsEstimateDeliveredItem extends GroupItem {
    private Double estimate;

    private Double spent;

    @Override
    public String getGroupItemType() {
        return "SpentVsEstimateDelivered";
    }
}
