package com.org.dashboard.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user-data-dashboard")
public class UserInfo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	
	public UserInfo() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", end_year=" + end_year + ", citylng=" + citylng + ", citylat=" + citylat
				+ ", intensity=" + intensity + ", sector=" + sector + ", topic=" + topic + ", insight=" + insight
				+ ", swot=" + swot + ", url=" + url + ", region=" + region + ", start_year=" + start_year + ", impact="
				+ impact + ", added=" + added + ", published=" + published + ", pestle=" + pestle + ", source=" + source
				+ ", title=" + title + ", likelihood=" + likelihood + ", relevance=" + relevance + ", country="
				+ country + ", city=" + city + "]";
	}

	public UserInfo(Long id, Integer end_year, String citylng, String citylat, Integer intensity, String sector,
			String topic, String insight, String swot, String url, String region, String start_year, String impact,
			String added, String published, String pestle, String source, String title, Integer likelihood,
			Integer relevance, String country, String city) {
		super();
		this.id = id;
		this.end_year = end_year;
		this.citylng = citylng;
		this.citylat = citylat;
		this.intensity = intensity;
		this.sector = sector;
		this.topic = topic;
		this.insight = insight;
		this.swot = swot;
		this.url = url;
		this.region = region;
		this.start_year = start_year;
		this.impact = impact;
		this.added = added;
		this.published = published;
		this.pestle = pestle;
		this.source = source;
		this.title = title;
		this.likelihood = likelihood;
		this.relevance = relevance;
		this.country = country;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEnd_year() {
		return end_year;
	}

	public void setEnd_year(Integer end_year) {
		this.end_year = end_year;
	}

	public String getCitylng() {
		return citylng;
	}

	public void setCitylng(String citylng) {
		this.citylng = citylng;
	}

	public String getCitylat() {
		return citylat;
	}

	public void setCitylat(String citylat) {
		this.citylat = citylat;
	}

	public Integer getIntensity() {
		return intensity;
	}

	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getInsight() {
		return insight;
	}

	public void setInsight(String insight) {
		this.insight = insight;
	}

	public String getSwot() {
		return swot;
	}

	public void setSwot(String swot) {
		this.swot = swot;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStart_year() {
		return start_year;
	}

	public void setStart_year(String start_year) {
		this.start_year = start_year;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getPestle() {
		return pestle;
	}

	public void setPestle(String pestle) {
		this.pestle = pestle;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLikelihood() {
		return likelihood;
	}

	public void setLikelihood(Integer likelihood) {
		this.likelihood = likelihood;
	}

	public Integer getRelevance() {
		return relevance;
	}

	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "end_year")
	private Integer end_year;
	
	@Column(name = "citylng")
	 private String citylng;
	 
	@Column(name = "citylat")
    private String citylat;
    
	@Column(name = "intensity")
    private Integer intensity;
    
	@Column(name = "sector")
    private String sector;
	
	@Column(name = "topic")
    private String topic;
	
	 @Column(name = "insight")
    private String insight;
    
    @Column(name = "swot")
    private String swot;
    
    @Column(name = "url")
    private String url;
    
    @Column(name = "region")
    private String region;
    
    @Column(name = "start_year")
    private  String start_year;
    
    @Column(name = "impact")
    private String impact;
    
    @Column(name = "added")
    private String added;
    
    @Column(name = "published")
    private String published;
    
    @Column(name = "pestle")
    private String pestle;
    
    @Column(name = "source")
    private String source;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "likelihood")
    private Integer likelihood;
    
    @Column(name = "relevance")
    private Integer relevance;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "city")
    private String city;

}
