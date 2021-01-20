package com.github.carl.gitseeker.calculate.provider.impl;

import com.github.carl.gitseeker.calculate.bean.BaseData;
import com.github.carl.gitseeker.calculate.provider.DataProvider;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class DefaultDataProvider implements DataProvider {

    private final JavaSparkContext sparkContext;

    public DefaultDataProvider(JavaSparkContext sparkContext) {
        this.sparkContext = sparkContext;
    }


    @Override
    public <T extends BaseData> JavaRDD<T> provide(Class<T> tClass) {
        return null;
    }
}
