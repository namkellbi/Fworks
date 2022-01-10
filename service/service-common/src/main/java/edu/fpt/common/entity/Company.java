package edu.fpt.common.entity;

public class Company {
    private long id;
    private long categoryId;
    private String name;
    private String email;
    private String phone;
    private String description;
    private String website;
    private long numberEmployees; //số lượng nhân viên đang có trong công ty
    private String address;
    private long createAt;
    private long updateAt;
    private boolean status;

    public Company(long id, long categoryId, String name, String email, String phone, String description, String website, long numberEmployees, String address, long createAt, long updateAt, boolean status) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.website = website;
        this.numberEmployees = numberEmployees;
        this.address = address;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public long getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(long numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
