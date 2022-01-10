package edu.fpt.common.entity;

public class Job {
    private long id;
    private long categoryId;
    private long companyId;
    private String jobName;
    private String jobDescription;
    private double salary;
    private long numberRecruitments; // tuyển dụng số lượng bao nhiêu người.
    private String rank; // tuyển dụng cấp bậc nào
    private String workForm; // parttime, fulltime, remote, ctv...
    private String experience; // yêu cầu số năm kinh nghiệm
    private boolean gender; // male, female, ko yêu cầu...
    private String workAddress;
    private long startDate; // ngày tuyển dụng
    private long endDate; // ngày kết thúc tuyển dụng

    public Job(long id, long categoryId, long companyId, String jobName, String jobDescription, double salary, long numberRecruitments, String rank, String workForm, String experience, boolean gender, String workAddress, long startDate, long endDate) {
        this.id = id;
        this.categoryId = categoryId;
        this.companyId = companyId;
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.salary = salary;
        this.numberRecruitments = numberRecruitments;
        this.rank = rank;
        this.workForm = workForm;
        this.experience = experience;
        this.gender = gender;
        this.workAddress = workAddress;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getNumberRecruitments() {
        return numberRecruitments;
    }

    public void setNumberRecruitments(long numberRecruitments) {
        this.numberRecruitments = numberRecruitments;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getWorkForm() {
        return workForm;
    }

    public void setWorkForm(String workForm) {
        this.workForm = workForm;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getworkAddress() {
        return workAddress;
    }

    public void setworkAddress(String workAddress) {
        this.workAddress = workAddress;
    }
}
