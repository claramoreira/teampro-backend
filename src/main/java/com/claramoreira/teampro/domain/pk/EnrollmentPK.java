package com.claramoreira.teampro.domain.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EnrollmentPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "user_id")
	private Integer user;

	@Column(name = "team_id")
	private Integer team;

	public EnrollmentPK() {
	}

	public EnrollmentPK(Integer user, Integer team) {
		super();
		this.user = user;
		this.team = team;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getTeam() {
		return team;
	}

	public void setTeam(Integer team) {
		this.team = team;
	}

	@Override
	public int hashCode() {
		return Objects.hash(team, user);
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
		return Objects.equals(team, other.team) && Objects.equals(user, other.user);
	}

}
