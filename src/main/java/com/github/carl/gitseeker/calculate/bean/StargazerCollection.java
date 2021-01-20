package com.github.carl.gitseeker.calculate.bean;

import com.github.carl.gitseeker.calculate.bean.detail.Stargazer;
import lombok.Data;

import java.util.List;

@Data
public class StargazerCollection extends BaseData {
    private Long stargazerId;
    private List<Stargazer> stargazers;
}
