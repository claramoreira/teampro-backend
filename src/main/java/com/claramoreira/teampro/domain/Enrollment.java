package com.claramoreira.teampro.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Id;

public class Enrollment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	private Integer userId;
	private Integer teamId;
	private Integer status;
	private Integer position;
	private Date startDate;
	private Date endDate;

	public Enrollment() {
	}

	public Enrollment(Integer id, Integer userId, Integer teamId, Integer status, Integer position, Date startDate,
			Date endDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.teamId = teamId;
		this.status = status;
		this.position = position;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
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
