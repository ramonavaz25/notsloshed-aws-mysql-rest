package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tip {

	@Id
	private int tip_id;



	public int getTip_id() {
		return tip_id;
	}



	public void setTip_id(int tip_id) {
		this.tip_id = tip_id;
	}



	private String tipname;
	private String tiplink;
	
    public String getTipname() {
		return tipname;
	}



	public void setTipname(String tipname) {
		this.tipname = tipname;
	}



	public String getTiplink() {
		return tiplink;
	}



	public void setTiplink(String tiplink) {
		this.tiplink = tiplink;
	}

	
   
    @Override
    public String toString() {
        return "Tip{" + "tipname='" + tipname + '\'' + ", tiplink='" + tiplink + '\'' + '}';
    }





}