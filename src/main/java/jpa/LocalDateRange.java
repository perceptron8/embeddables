package jpa;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;

@Embeddable
public class LocalDateRange {
	private LocalDate startInclusive;
	private LocalDate endExclusive;
	
	public LocalDate getStartInclusive() {
		return startInclusive;
	}
	
	public void setStartInclusive(LocalDate startInclusive) {
		this.startInclusive = startInclusive;
	}
	
	public LocalDate getEndExclusive() {
		return endExclusive;
	}
	
	public void setEndExclusive(LocalDate endExclusive) {
		this.endExclusive = endExclusive;
	}
}
