package in.cdac.main.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class registeruser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "name", length = 30)
	private String name;
	@Column(name = "email", length = 30)
	private String email;
	
	@Column(name = "pwd", length = 30)
	private String pwd;
	
	@Column(name = "mobile", length = 30)
	private String mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationdate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date modificationdate;


	
	
	
	
	
	
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	public Date getModificationdate() {
		return modificationdate;
	}
	public void setModificationdate(Date modificationdate) {
		this.modificationdate = modificationdate;
	}
	
	@PreUpdate
	public void onModify() {
		this.modificationdate = new Date();
	}
	
	@PrePersist
	public void onCreate() {
		this.creationdate = new Date();
	}
}
