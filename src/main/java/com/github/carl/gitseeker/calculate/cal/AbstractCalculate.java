package com.github.carl.gitseeker.calculate.cal;

import com.github.carl.gitseeker.calculate.bean.BaseData;
import com.github.carl.gitseeker.calculate.config.CalculateRuleConfig;
import com.github.carl.gitseeker.calculate.config.SparkConfig;
import com.github.carl.gitseeker.calculate.provider.DataProvider;
import com.github.carl.gitseeker.calculate.provider.impl.DefaultDataProvider;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public abstract class AbstractCalculate {

    private final DataProvider dataProvider;
    protected final JavaSparkContext javaSparkContext;
    protected final CalculateRuleConfig ruleConfig;

    public AbstractCalculate() {
        this.javaSparkContext = SparkConfig.getSparkContext();
        this.ruleConfig = CalculateRuleConfig.initCalculateRuleConfig();
        this.dataProvider = new DefaultDataProvider(javaSparkContext);
    }

    protected <T extends BaseData> JavaRDD<T> getRdd(Class<T> tClass) {
        return dataProvider.provide(tClass);
    }

}
