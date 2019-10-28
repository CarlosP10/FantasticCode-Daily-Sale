package com.fantasticCode.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "public", name = "table_offer")
public class Offer {
	@Id
	@GeneratedValue(generator="offer_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "offer_seq", sequenceName = "public.offer_seq",allocationSize=1)
	@Column(name = "offer_id")
	private Integer idoffer;
	
	@Column(name = "name")
	private String offername;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "url_poster")
	private String urlposter;
	
	@Column(name = "availability")
	private int availability;

	@Column(name = "start_date")
	private Date startdate;
	
	@Column(name = "end_date")
	private Date enddate;
	
	@Column(name = "code")
	private String offer_code;
	
	@Column(name = "state")
	private int offer_state;
	
	@Column(name = "price_range")
	private float price_range;
			
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_offer_type", referencedColumnName = "id_type")
	private Offer_type type;
	
	@Column(name = "creation_date_hour")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creation_date_hour;

	public Integer getIdoffer() {
		return idoffer;
	}

	public void setIdoffer(Integer idoffer) {
		this.idoffer = idoffer;
	}

	public String getOffername() {
		return offername;
	}

	public void setOffername(String offername) {
		this.offername = offername;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getUrlposter() {
		return urlposter;
	}

	public void setUrlposter(String urlposter) {
		this.urlposter = urlposter;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getOffer_code() {
		return offer_code;
	}

	public void setOffer_code(String offer_code) {
		this.offer_code = offer_code;
	}

	public int getOffer_state() {
		return offer_state;
	}

	public void setOffer_state(int offer_state) {
		this.offer_state = offer_state;
	}

	public float getPrice_range() {
		return price_range;
	}

	public void setPrice_range(float price_range) {
		this.price_range = price_range;
	}

	public Offer_type getType() {
		return type;
	}

	public void setType(Offer_type type) {
		this.type = type;
	}

	public Date getCreation_date_hour() {
		return creation_date_hour;
	}

	public void setCreation_date_hour(Date creation_date_hour) {
		this.creation_date_hour = creation_date_hour;
	}

	public Offer(Integer idoffer, String offername, String description, String duration, String urlposter,
			int availability, Date startdate, Date enddate, String offer_code, int offer_state, float price_range,
			Offer_type type, Date creation_date_hour) {
		super();
		this.idoffer = idoffer;
		this.offername = offername;
		this.description = description;
		this.duration = duration;
		this.urlposter = urlposter;
		this.availability = availability;
		this.startdate = startdate;
		this.enddate = enddate;
		this.offer_code = offer_code;
		this.offer_state = offer_state;
		this.price_range = price_range;
		this.type = type;
		this.creation_date_hour = creation_date_hour;
	}

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	
	
	
	
	
}
