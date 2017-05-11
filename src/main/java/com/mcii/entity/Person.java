package com.mcii.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/*PS：我这里用了一个@Data注解，此注解会自动生成get方法，set方法，toString方法等一系列方法，
功能十分强大，不过需要安装插件以及导包， 有兴趣的可以百度下
当然，你也可以手动编写get/set/构造方法。*/
@Data
@Entity
@Table(name="person")
public class Person {
   @Id
   @GeneratedValue
   private Long id;
   @Column(name="created")
   private Long created = System.currentTimeMillis();
   @Column(name="username")
   private String name;
   @Column(name="address")
   private String address;
   @Column(name="phone")
   private String phone;
   @Column(name = "remark")
   private String remark;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getCreated() {
	return created;
}
public void setCreated(Long created) {
	this.created = created;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
   
}
