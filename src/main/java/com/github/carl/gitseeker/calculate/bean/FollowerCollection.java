package com.github.carl.gitseeker.calculate.bean;

import com.github.carl.gitseeker.calculate.bean.detail.Follower;
import lombok.Data;

import java.util.List;

@Data
public class FollowerCollection extends BaseData {
    private Long followerId;
    private List<Follower> followers;
}
