package com.wx.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created By 002764
 * on 2018/10/18 10:46
 */
public abstract class AbstractLoadingCache<K,V> {
    LoadingCache cache = null;
    private int maximumSize = 1000;
    private int expireAfterWriteDuration = 60;      //数据存在时长，子类在构造方法中调用setExpireAfterWriteDuration(int duration)来更改
    private TimeUnit timeUnit = TimeUnit.MINUTES;   //默认时间单位（分钟）   子类在构造方法中调用setTimeUnit(TimeUnit timeUnit)来更改

    public LoadingCache<K ,V> getCache(){
        if (cache == null) {
            synchronized (this) {
                if (cache == null) {
                    cache = CacheBuilder.newBuilder().maximumSize(maximumSize).expireAfterWrite(expireAfterWriteDuration, timeUnit).recordStats().build(new CacheLoader<K, V>() {
                        @Override
                        public V load(K key) throws Exception {
                            System.out.println("AbstractLoadingCache loadData key =  {}");
                            return loadData(key);
                        }
                    });
                    System.out.println("本地缓存{}初始化成功!");
                }
            }
        }

        return cache;
    }

    public abstract V  loadData(K key);

    public void refresh(K key){
        System.out.println("在abstract中开始执行");
    }
}
