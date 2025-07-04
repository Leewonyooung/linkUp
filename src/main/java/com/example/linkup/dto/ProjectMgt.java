package com.example.linkup.dto;

import java.util.List;

// 구인자 - 내 프로젝트 조회/관리
public class ProjectMgt {
    private int projectId; // 프로젝트 아이디
    private String title; // 구인공고
    private String category; // 카테고리
    private String skills; // 필요 기술
    private String status; //상태
    private String regDate; //프로젝트 등록일
    private String startDate; //프로젝트 시작일
    private String deadlineDate;
    private String endDate; // 프로젝트 끝나는 날
    private int duration; //프로젝트 진행 개월 수
    private int totalAmount; // 프로젝트 총 단가
    private int applyCount; //지원자 수
    //서블릿에서 직접 계산
    private String projectProgress;  // "시작전", "진행중", "종료됨"
    private String settleStatus;     // "진행중", "완료"

    private List<ProjectPay> payList; // ProjectPay DTO 불러오기

    public ProjectMgt() {} //기본 생성자

    public ProjectMgt(int projectId, String title, String category, String skills, String status, String regDate, String startDate, String endDate, String deadlineDate, int duration, int totalAmount, int applyCount, List<ProjectPay> payList) {
        this.projectId = projectId;
        this.title = title;
        this.category = category;
        this.skills = skills;
        this.status = status;
        this.regDate = regDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deadlineDate = deadlineDate;
        this.totalAmount = totalAmount;
        this.applyCount = applyCount;
        this.payList = payList;
        this.duration = duration;

    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(int applyCount) {
        this.applyCount = applyCount;
    }

    public List<ProjectPay> getPayList() {
        return payList;
    }

    public void setPayList(List<ProjectPay> payList) {
        this.payList = payList;
    }

    public String getProjectProgress() {
        return projectProgress;
    }

    public void setProjectProgress(String projectProgress) {
        this.projectProgress = projectProgress;
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ProjectMgt{" +
                "projectId=" + projectId +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", skills='" + skills + '\'' +
                ", status='" + status + '\'' +
                ", regDate='" + regDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", deadlineDate='" + deadlineDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", duration=" + duration +
                ", totalAmount=" + totalAmount +
                ", applyCount=" + applyCount +
                ", projectProgress='" + projectProgress + '\'' +
                ", settleStatus='" + settleStatus + '\'' +
                ", payList=" + payList +
                '}';
    }
}
