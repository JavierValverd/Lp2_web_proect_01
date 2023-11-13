package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "subject")
public class Subject {
@Id
private int idSubject;
private String code;
private String name;
private String level;
private String teacher;

@Override
public String toString() {
	return "Subject [idSubject=" + idSubject + ", code=" + code + ", name=" + name + ", level=" + level + ", teacher="
			+ teacher + "]";
}

public int getIdSubject() {
	return idSubject;
}

public String getCode() {
	return code;
}

public String getName() {
	return name;
}

public String getLevel() {
	return level;
}

public String getTeacher() {
	return teacher;
}

public void setIdSubject(int idSubject) {
	this.idSubject = idSubject;
}

public void setCode(String code) {
	this.code = code;
}

public void setName(String name) {
	this.name = name;
}

public void setLevel(String level) {
	this.level = level;
}

public void setTeacher(String teacher) {
	this.teacher = teacher;
}
	
	
	
	
}
