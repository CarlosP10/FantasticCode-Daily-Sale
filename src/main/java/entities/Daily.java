package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "daily-table")
public class Daily {
	@Id
	@GeneratedValue(generator = "daily-seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "daily-seq", sequenceName = "public.daily_seq", allocationSize = 1)
	@Column(name = "id_Daily")
	private Integer idDaily;
	
	@Column(name = "name_Daily")
	private String nameDaily;
	
	@Column(name = "image_Daily")
	private String imageDaily;
	
	@Column(name = "description_Daily")
	private String descriptionDaily;
	
	@Column(name = "price_Daily")
	private Double price_Daily;

	@Column(name = "offer_Daily")
	private Double offer_Daily;
	
	@Column(name = "end_Date_Daily")
	private String endDateDaily;

	public Integer getIdDaily() {
		return idDaily;
	}

	public void setIdDaily(Integer idDaily) {
		this.idDaily = idDaily;
	}

	public String getNameDaily() {
		return nameDaily;
	}

	public void setNameDaily(String nameDaily) {
		this.nameDaily = nameDaily;
	}

	public String getImageDaily() {
		return imageDaily;
	}

	public void setImageDaily(String imageDaily) {
		this.imageDaily = imageDaily;
	}

	public String getDescriptionDaily() {
		return descriptionDaily;
	}

	public void setDescriptionDaily(String descriptionDaily) {
		this.descriptionDaily = descriptionDaily;
	}

	public Double getPrice_Daily() {
		return price_Daily;
	}

	public void setPrice_Daily(Double price_Daily) {
		this.price_Daily = price_Daily;
	}

	public Double getOffer_Daily() {
		return offer_Daily;
	}

	public void setOffer_Daily(Double offer_Daily) {
		this.offer_Daily = offer_Daily;
	}

	public String getEndDateDaily() {
		return endDateDaily;
	}

	public void setEndDateDaily(String endDateDaily) {
		this.endDateDaily = endDateDaily;
	}

	public Daily(Integer idDaily, String nameDaily, String imageDaily, String descriptionDaily, Double price_Daily,
			Double offer_Daily, String endDateDaily) {
		super();
		this.idDaily = idDaily;
		this.nameDaily = nameDaily;
		this.imageDaily = imageDaily;
		this.descriptionDaily = descriptionDaily;
		this.price_Daily = price_Daily;
		this.offer_Daily = offer_Daily;
		this.endDateDaily = endDateDaily;
	}

	public Daily() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
}
