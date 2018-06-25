package com.byhovsky.soap1;

public class User {
    public String userId;
    public String firsrName;
    public String lastName;
    public String email;
    public String phone;


    public User(String userId, String firsrName, String lastName) {
        this.userId = userId;
        this.firsrName = firsrName;
        this.lastName = lastName;
    }

    /**
     * Getter for property 'userId'.
     *
     * @return Value for property 'userId'.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter for property 'userId'.
     *
     * @param userId Value to set for property 'userId'.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter for property 'firsrName'.
     *
     * @return Value for property 'firsrName'.
     */
    public String getFirsrName() {
        return firsrName;
    }

    /**
     * Setter for property 'firsrName'.
     *
     * @param firsrName Value to set for property 'firsrName'.
     */
    public void setFirsrName(String firsrName) {
        this.firsrName = firsrName;
    }

    /**
     * Getter for property 'lastName'.
     *
     * @return Value for property 'lastName'.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for property 'lastName'.
     *
     * @param lastName Value to set for property 'lastName'.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for property 'email'.
     *
     * @return Value for property 'email'.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for property 'email'.
     *
     * @param email Value to set for property 'email'.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for property 'phone'.
     *
     * @return Value for property 'phone'.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for property 'phone'.
     *
     * @param phone Value to set for property 'phone'.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}