package com.github.carl.gitseeker.calculate.bean;

import com.github.carl.gitseeker.calculate.bean.detail.Participant;
import lombok.Data;

import java.util.List;

@Data

public class ParticipantCollection extends BaseData {
    private Long participantId;
    private List<Participant> participants;
}
