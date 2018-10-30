package com.wx.guava.guava;

import com.wx.guava.guava.City;
import com.wx.guava.AbstractLoadingCache;
import com.wx.guava.ILocalCache;

/**
 * Created By 002764
 * on 2018/10/18 11:12
 */
public class GuavaCacheService extends AbstractLoadingCache<String, City> implements ILocalCache<String,City> {

    @Override
    public City loadData(String key) {
        return new City("默认编码","默认名称");
    }

    public void show() {

    }
}
