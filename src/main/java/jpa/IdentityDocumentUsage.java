package jpa;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class IdentityDocumentUsage {
	@Embedded
	private LocalDateRange interval;
	@Embedded
	private IdentityDocument document;
	
	public LocalDateRange getInterval() {
		return interval;
	}
	public void setInterval(LocalDateRange interval) {
		this.interval = interval;
	}
	public IdentityDocument getDocument() {
		return document;
	}
	public void setDocument(IdentityDocument document) {
		this.document = document;
	}
}
