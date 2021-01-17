package com.github.carl.gitseeker.calculate.provider;

import com.github.carl.gitseeker.calculate.bean.BaseData;

public interface DataProvider {
    <T extends BaseData> T provide(T object);
}
