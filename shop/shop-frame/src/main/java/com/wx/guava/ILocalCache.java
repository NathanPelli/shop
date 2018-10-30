package com.wx.guava;

public interface ILocalCache<K,V> {
    public void show();
    public void refresh(K key);
}
