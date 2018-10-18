package com.ocean.springbootmybatisdemo.repository.dal.test.dataobject;

import java.util.Date;

/**
 * The table USER_INFO
 */
public class UserInfoDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * name NAME.
     */
    private String name;
    /**
     * age AGE.
     */
    private Integer age;
    /**
     * gmtCreate GMT_CREATE.
     */
    private Date gmtCreate;
    /**
     * gmtModify GMT_MODIFY.
     */
    private Date gmtModify;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set name NAME.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get name NAME.
     *
     * @return the string
     */
    public String getName(){
        return name;
    }

    /**
     * Set age AGE.
     */
    public void setAge(Integer age){
        this.age = age;
    }

    /**
     * Get age AGE.
     *
     * @return the string
     */
    public Integer getAge(){
        return age;
    }

    /**
     * Set gmtCreate GMT_CREATE.
     */
    public void setGmtCreate(Date gmtCreate){
        this.gmtCreate = gmtCreate;
    }

    /**
     * Get gmtCreate GMT_CREATE.
     *
     * @return the string
     */
    public Date getGmtCreate(){
        return gmtCreate;
    }

    /**
     * Set gmtModify GMT_MODIFY.
     */
    public void setGmtModify(Date gmtModify){
        this.gmtModify = gmtModify;
    }

    /**
     * Get gmtModify GMT_MODIFY.
     *
     * @return the string
     */
    public Date getGmtModify(){
        return gmtModify;
    }
}
