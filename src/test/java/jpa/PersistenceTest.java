package jpa;

import org.junit.jupiter.api.Test;

import jakarta.persistence.Persistence;

public class PersistenceTest {
	@Test
	public void createEntityManagerFactory() {
		Persistence.createEntityManagerFactory("jpa");
	}
}
