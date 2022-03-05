package edu.fpt.common.entity;

public class User {
    private long id;
    private String fullName;
    private long age;
    private String address;
    private String email;
    private String phone;
    private String description;
    private long createAt;
    private long updateAt;
    private boolean isAdmin;
    private boolean status;

    public User(long id, String fullName, long age, String address, String email, String phone, String description, long createAt, long updateAt, boolean isAdmin, boolean status) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.description = description;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.isAdmin = isAdmin;
        this.status = status;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
