package com.mayur.test;

public class UserObject {
private String name;
private String id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public boolean equals(Object obj){
	return (this.id).equals(((UserObject)obj).getId());
}
}
