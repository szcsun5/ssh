package com.mcii.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/*PS������������һ��@Dataע�⣬��ע����Զ�����get������set������toString������һϵ�з�����
����ʮ��ǿ�󣬲�����Ҫ��װ����Լ������� ����Ȥ�Ŀ��԰ٶ���
��Ȼ����Ҳ�����ֶ���дget/set/���췽����*/
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
