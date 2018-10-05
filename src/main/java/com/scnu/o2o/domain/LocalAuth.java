package com.scnu.o2o.domain;

import java.util.Date;

public class LocalAuth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_local_auth.local_auth_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private Integer localAuthId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_local_auth.user_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_local_auth.user_name
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_local_auth.password
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_local_auth.create_time
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_local_auth.last_edit_time
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    private Date lastEditTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_local_auth.local_auth_id
     *
     * @return the value of tb_local_auth.local_auth_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public Integer getLocalAuthId() {
        return localAuthId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_local_auth.local_auth_id
     *
     * @param localAuthId the value for tb_local_auth.local_auth_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setLocalAuthId(Integer localAuthId) {
        this.localAuthId = localAuthId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_local_auth.user_id
     *
     * @return the value of tb_local_auth.user_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_local_auth.user_id
     *
     * @param userId the value for tb_local_auth.user_id
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_local_auth.user_name
     *
     * @return the value of tb_local_auth.user_name
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_local_auth.user_name
     *
     * @param userName the value for tb_local_auth.user_name
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_local_auth.password
     *
     * @return the value of tb_local_auth.password
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_local_auth.password
     *
     * @param password the value for tb_local_auth.password
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_local_auth.create_time
     *
     * @return the value of tb_local_auth.create_time
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_local_auth.create_time
     *
     * @param createTime the value for tb_local_auth.create_time
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_local_auth.last_edit_time
     *
     * @return the value of tb_local_auth.last_edit_time
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public Date getLastEditTime() {
        return lastEditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_local_auth.last_edit_time
     *
     * @param lastEditTime the value for tb_local_auth.last_edit_time
     *
     * @mbggenerated Thu Oct 04 14:40:21 CST 2018
     */
    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}