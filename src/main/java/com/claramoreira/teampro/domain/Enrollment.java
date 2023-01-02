package com.claramoreira.teampro.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.claramoreira.teampro.domain.pk.EnrollmentPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "enrollments")
public class Enrollment implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EnrollmentPK id; 

	@ManyToOne
    @MapsId("user")
	private User user;

	@ManyToOne
    @MapsId("team")
	@JsonIgnore
	private Team team;

	private Integer status;
	private Integer position;
	private Date startDate;
	private Date endDate;

	public Enrollment() {

	}

	public Enrollment(User user, Team team, Integer status, Integer position, Date startDate,
			Date endDate) {
		super();
		this.id = new EnrollmentPK(user.getId(), team.getId());;
		this.user = user;
		this.team = team;
		this.status = status;
		this.position = position;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrollment other = (Enrollment) obj;
		return Objects.equals(id, other.id);
	}

}
