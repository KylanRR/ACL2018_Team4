import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnit_Collision {
	private Heros hero=new Heros(3,4,0,0,5);
	private Monstres monstre=new Monstres(3,3,0,0,5);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@Test
	
	boolean checkCollisions1() {
		if((coordX1 != coordX2)&& (coordY1 != coordY2)) {
			return true;
		}
			return false;
		
	}
	
	
	void statusVie() {
		assertTrue(hero.statusVie(1,2));
	}
	
	void  DiminutionVieHero() {
		assertTrue(hero.diminutionVie(2,3));
	}
	
	void  AugmentationVieMonstre() {
		assertTrue(monstre.augmentationVie(1,4));
	}

}
