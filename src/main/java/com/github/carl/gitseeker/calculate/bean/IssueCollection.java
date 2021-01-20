package com.github.carl.gitseeker.calculate.bean;

import com.github.carl.gitseeker.calculate.bean.detail.Issue;
import lombok.Data;

import java.util.List;

@Data
public class IssueCollection extends BaseData {
    private Long issueId;
    private List<Issue> issues;
}
