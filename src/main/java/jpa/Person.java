package jpa;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private Long id;
	@ElementCollection
	private List<IdentityDocumentUsage> identityDocumentsUsages;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<IdentityDocumentUsage> getIdentityDocumentsUsages() {
		return identityDocumentsUsages;
	}
	public void setIdentityDocumentsUsages(List<IdentityDocumentUsage> identityDocumentsUsages) {
		this.identityDocumentsUsages = identityDocumentsUsages;
	}
}
