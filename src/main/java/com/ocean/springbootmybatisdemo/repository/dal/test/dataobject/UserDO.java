package com.ocean.springbootmybatisdemo.repository.dal.test.dataobject;


/**
 * The table USER
 */
public class UserDO{

    /**
     * id ID.
     */
    private Integer id;
    /**
     * username USERNAME.
     */
    private String username;

    /**
     * Set id ID.
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set username USERNAME.
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * Get username USERNAME.
     *
     * @return the string
     */
    public String getUsername(){
        return username;
    }
}
