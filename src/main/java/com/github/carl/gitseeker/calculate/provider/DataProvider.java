package com.github.carl.gitseeker.calculate.provider;

import com.github.carl.gitseeker.calculate.bean.BaseData;
import org.apache.spark.api.java.JavaRDD;

import java.util.List;

public interface DataProvider {
     <T extends BaseData> JavaRDD<T> provide(Class<T> tClass);
}
