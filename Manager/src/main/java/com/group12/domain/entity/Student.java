package com.group12.domain.entity;
// Generated 2017-3-30 17:33:33 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "SKF")
public class Student implements java.io.Serializable {

	private Integer stuNum;
	private String stuFname;
	private String stuLname;
	private String stuInitial;
	private Date stuDob;
	private String stuMobileNum;
	private String stuEmail;
	private String stuAddress;
	private Integer parNum;

	public Student() {
	}

	public Student(String stuFname, String stuLname, Date stuDob, String stuMobileNum, String stuEmail,
			String stuAddress) {
		this.stuFname = stuFname;
		this.stuLname = stuLname;
		this.stuDob = stuDob;
		this.stuMobileNum = stuMobileNum;
		this.stuEmail = stuEmail;
		this.stuAddress = stuAddress;
	}

	public Student(String stuFname, String stuLname, String stuInitial, Date stuDob, String stuMobileNum,
			String stuEmail, String stuAddress, Integer parNum) {
		this.stuFname = stuFname;
		this.stuLname = stuLname;
		this.stuInitial = stuInitial;
		this.stuDob = stuDob;
		this.stuMobileNum = stuMobileNum;
		this.stuEmail = stuEmail;
		this.stuAddress = stuAddress;
		this.parNum = parNum;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Stu_Num", unique = true, nullable = false)
	public Integer getStuNum() {
		return this.stuNum;
	}

	public void setStuNum(Integer stuNum) {
		this.stuNum = stuNum;
	}

	@Column(name = "Stu_FName", nullable = false, length = 45)
	public String getStuFname() {
		return this.stuFname;
	}

	public void setStuFname(String stuFname) {
		this.stuFname = stuFname;
	}

	@Column(name = "Stu_LName", nullable = false, length = 45)
	public String getStuLname() {
		return this.stuLname;
	}

	public void setStuLname(String stuLname) {
		this.stuLname = stuLname;
	}

	@Column(name = "Stu_Initial", length = 45)
	public String getStuInitial() {
		return this.stuInitial;
	}

	public void setStuInitial(String stuInitial) {
		this.stuInitial = stuInitial;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Stu_DOB", nullable = false, length = 10)
	public Date getStuDob() {
		return this.stuDob;
	}

	public void setStuDob(Date stuDob) {
		this.stuDob = stuDob;
	}

	@Column(name = "Stu_Mobile_Num", nullable = false, length = 45)
	public String getStuMobileNum() {
		return this.stuMobileNum;
	}

	public void setStuMobileNum(String stuMobileNum) {
		this.stuMobileNum = stuMobileNum;
	}

	@Column(name = "Stu_Email", nullable = false, length = 45)
	public String getStuEmail() {
		return this.stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	@Column(name = "Stu_Address", nullable = false, length = 45)
	public String getStuAddress() {
		return this.stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	@Column(name = "Par_Num")
	public Integer getParNum() {
		return this.parNum;
	}

	public void setParNum(Integer parNum) {
		this.parNum = parNum;
	}

}