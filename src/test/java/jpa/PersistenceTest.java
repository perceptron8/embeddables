package jpa;

import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class PersistenceTest {
	@Test
	public void createEntityManagerFactory() {
		Persistence.createEntityManagerFactory("jpa");
	}
}
