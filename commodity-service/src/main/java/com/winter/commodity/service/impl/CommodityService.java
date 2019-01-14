package com.winter.commodity.service.impl;

import com.winter.commodity.domain.Commodity;
import com.winter.commodity.service.ICommodityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * CommodityService
 *
 * @author Gavin
 * @date 2019/1/11 15:39
 */
@Service
public class CommodityService implements ICommodityService {
    private static List<Commodity> commodities;

    static {
        int num = 10;
        commodities = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            commodities.add(new Commodity((long) i, "C0" + i, i * 10.0, new Date(System.currentTimeMillis()), (i % 2 == 0) ? true : false));
        }
    }

    @Override
    public List<Commodity> getCommodityByIds(String[] commodityCodes) {
        List<Commodity> list = new ArrayList<>();
        for (String code : commodityCodes) {
            commodities.forEach(commodity -> {
                if (commodity.getCode().equals(code)) {
                    list.add(commodity);
                }
            });
        }
        return list;
    }
}
