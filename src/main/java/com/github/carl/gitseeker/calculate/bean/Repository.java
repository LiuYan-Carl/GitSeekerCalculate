package com.github.carl.gitseeker.calculate.bean;

import lombok.Data;

@Data
public class Repository extends BaseData {

    private Long id;
    private String repositoryName;
    private String repositoryFullName;
    private Long ownerId;
    private String htmlUrl;
    private String description;
    private String language;


    private Long issueId;
    private Long followerId;
    private Long stargazerId;
    private Long participantId;

}
