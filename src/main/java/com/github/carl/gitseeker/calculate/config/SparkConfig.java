package com.github.carl.gitseeker.calculate.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.ResourceBundle;

public class SparkConfig {

    private static JavaSparkContext SPARK_CONTEXT = null;

    private SparkConfig() {

    }

    public static JavaSparkContext getSparkContext() {
        if (SPARK_CONTEXT == null) {
            init();
        }
        return SPARK_CONTEXT;
    }

    private static void init() {
        ResourceBundle sparkConfig = ResourceBundle.getBundle("spark-config");
        SparkConf conf = new SparkConf();
        conf.setAppName(sparkConfig.getString("spark.app.name"));
        conf.set("spark.driver.cores", sparkConfig.getString("spark.driver.cores"));
        conf.set("spark.driver.memory", sparkConfig.getString("spark.driver.memory"));
        conf.set("spark.executor.memory", sparkConfig.getString("spark.executor.memory"));
        conf.set("spark.logConf", sparkConfig.getString("spark.logConf"));
        conf.set("spark.shuffle.manager", sparkConfig.getString("spark.shuffle.manager"));
        conf.set("spark.shuffle.compress", sparkConfig.getString("spark.shuffle.compress"));
        conf.set("spark.default.parallelism", sparkConfig.getString("spark.default.parallelism"));

        SPARK_CONTEXT = new JavaSparkContext(conf);
    }
}
