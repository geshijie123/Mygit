package net.chenlin.dp.modules.wx.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class UserEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Integer id;
	
	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private String pwd;
	
	/**
	 * 
	 */
	private Date date;
	
	/**
	 * 
	 */
	private String res;
	

	public UserEntity() {
		super();
	}

    /**
     * setter for id
     * @param id
     */
	public void setId(Integer id) {
		this.id = id;
	}

    /**
     * getter for id
     */
	public Integer getId() {
		return id;
	}
	
    /**
     * setter for name
     * @param name
     */
	public void setName(String name) {
		this.name = name;
	}

    /**
     * getter for name
     */
	public String getName() {
		return name;
	}
	
    /**
     * setter for pwd
     * @param pwd
     */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

    /**
     * getter for pwd
     */
	public String getPwd() {
		return pwd;
	}
	
    /**
     * setter for date
     * @param date
     */
	public void setDate(Date date) {
		this.date = date;
	}

    /**
     * getter for date
     */
	public Date getDate() {
		return date;
	}
	
    /**
     * setter for res
     * @param res
     */
	public void setRes(String res) {
		this.res = res;
	}

    /**
     * getter for res
     */
	public String getRes() {
		return res;
	}
	
}
