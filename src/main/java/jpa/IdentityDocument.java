package jpa;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
//@Access(AccessType.FIELD)
public class IdentityDocument {
	@Enumerated(EnumType.STRING)
	private IdentityDocumentType type;
	@Basic
	private String description;
	
	public IdentityDocumentType getType() {
		return type;
	}
	public void setType(IdentityDocumentType type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
