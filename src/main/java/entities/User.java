package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "table_user")
public class User {
	@Id
	@GeneratedValue(generator = "user_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "user_seq", sequenceName = "public.user_seq", allocationSize = 1)
	@Column(name = "id_user")
	private Integer iduser;

	@Column(name = "u_name")
	private String uname;

	@Column(name = "u_lastname")
	private String ulastname;

	@Column(name = "u_country")
	private String ucountry;

	@Column(name = "u_address")
	private String uaddress;

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUlastname() {
		return ulastname;
	}

	public void setUlastname(String ulastname) {
		this.ulastname = ulastname;
	}

	public String getUcountry() {
		return ucountry;
	}

	public void setUcountry(String ucountry) {
		this.ucountry = ucountry;
	}

	public String getUadress() {
		return uaddress;
	}

	public void setUadress(String uadress) {
		this.uaddress = uadress;
	}

	public User(Integer iduser, String uname, String ulastname, String ucountry,
			String uadress) {
		super();
		this.iduser = iduser;
		this.uname = uname;
		this.ulastname = ulastname;
		this.ucountry = ucountry;
		this.uaddress = uadress;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}