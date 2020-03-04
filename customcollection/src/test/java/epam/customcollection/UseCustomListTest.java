package epam.customcollection;

import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;



public class UseCustomListTest {
	private static final Logger logger=LogManager.getLogger(UseCustomListTest.class);
	@Test
	public void test() {
		UseCustomList fruits=new UseCustomList();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("promogranite");
		fruits.add("water melon");
		fruits.add("pine apple");
		fruits.add("orange");
		fruits.add("carrot");
		fruits.add("beetroot");
		fruits.add("papaya");
		fruits.add("kiwi");
		fruits.add("dragon fruit");
		fruits.remove(2);
		assertEquals("[apple,banana,water melon,pine apple,orange,carrot,beetroot,papaya,kiwi,dragon fruit]",fruits.print() );
		assertEquals(10,fruits.length());
		assertEquals("orange",fruits.get(4));
		logger.info("Items added and removed successfully");
		logger.debug(fruits.print());
		logger.warn("No warnings in using the custom list");
		logger.error("No errors in using the custom list");
		}
	@Test
	public void test2() {
		UseCustomList festivals=new UseCustomList();
		festivals.add("Diwali");
		festivals.add("Dusshera");
		festivals.add("Sankranthi");
		festivals.add("Moharam");
		festivals.add("Ramzan");
		festivals.add("Christmas");
		festivals.add("Ugadhi");
		festivals.remove(6);
		assertEquals("[Diwali,Dusshera,Sankranthi,Moharam,Ramzan,Christmas]",festivals.print() );
		assertEquals(6,festivals.length());
		assertEquals("Ramzan",festivals.get(4));
		logger.info("Items added and removed successfully");
		logger.debug(festivals.print());
		logger.warn("No warnings in using the custom list");
		logger.error("No errors in using the custom list");
		}

}
