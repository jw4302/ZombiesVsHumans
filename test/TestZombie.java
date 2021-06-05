import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestZombie {

//	@BeforeEach
//	void setUp() throws Exception {
//	}

	@Test
	public void testCreation() {
		
		Zombie deadFred = new Zombie(50);
		assertEquals(50, deadFred.getLifePoints());

	}
	
	/*
	 * Testing taking damage in
	 */
	@Test
	public void testTakeHit() {
		
		Zombie deadFred = new Zombie(50);
		deadFred.takeHit(20);
		assertEquals(30 , deadFred.getLifePoints());
		
	}

	/*
	 * Weapon Random Damage
	 */
	@Test
	public void testRandomDamage() {
		Zombie deadFred = new Zombie(50);
		deadFred.takeHit(5);
		assertTrue((45 <= deadFred.getLifePoints()) && (50 >= deadFred.getLifePoints()));
		
	}
}
