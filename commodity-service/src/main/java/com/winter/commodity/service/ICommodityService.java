package com.winter.commodity.service;

import com.winter.commodity.domain.Commodity;

import java.util.List;

/**
 * ICommodityService
 *
 * @author Gavin
 * @date 2019/1/11 15:37
 */
public interface ICommodityService {

    List<Commodity> getCommodityByIds(String[] commodityCodes);
}
