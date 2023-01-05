package com.claramoreira.teampro.domain.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EnrollmentPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "team_id")
	private Integer team_id;

	public EnrollmentPK() {
	}

	public EnrollmentPK(Integer user, Integer team) {
		super();
		this.user_id = user;
		this.team_id = team;
	}

	public Integer getUser() {
		return user_id;
	}

	public void setUser(Integer user) {
		this.user_id = user;
	}

	public Integer getTeam() {
		return team_id;
	}

	public void setTeam(Integer team) {
		this.team_id = team;
	}

	@Override
	public int hashCode() {
		return Objects.hash(team_id, user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrollmentPK other = (EnrollmentPK) obj;
		return Objects.equals(team_id, other.team_id) && Objects.equals(user_id, other.user_id);
	}

}
