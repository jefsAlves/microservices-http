package com.alvesjefs.hr_payroll.domain;

import java.io.Serializable;
import java.util.Objects;

public class Workers implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double dailyIncome;

	public Workers() {
	}

	public Workers(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
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
		Workers other = (Workers) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Workers [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dailyIncome=");
		builder.append(dailyIncome);
		builder.append("]");
		return builder.toString();
	}

}