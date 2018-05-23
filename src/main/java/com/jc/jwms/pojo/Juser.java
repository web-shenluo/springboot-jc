package com.jc.jwms.pojo;

import java.io.Serializable;

/**
 * @author: shenluo
 * @date: 2018年5月21日 下午4:13:36 
 */
public class Juser implements Serializable{
	
	private static final long serialVersionUID = 6973576143316146251L;
	private long id;
    private String name;
    private String sex;
    
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", sex=" + sex + '}';
    }

}
