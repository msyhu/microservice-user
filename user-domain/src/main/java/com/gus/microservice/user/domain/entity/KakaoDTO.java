package com.gus.microservice.user.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class KakaoDTO {
    private String title;
    private String endDate;
    private String location;
    private String[] jobGroups;
    private String company;
    private String jobType;

    @Override
    public String toString() {
        return "KakaoDTO{" +
                "title='" + title + '\'' +
                ", endDate='" + endDate + '\'' +
                ", location='" + location + '\'' +
                ", jobGroups=" + Arrays.toString(jobGroups) +
                ", company='" + company + '\'' +
                ", jobType='" + jobType + '\'' +
                '}';
    }
}
