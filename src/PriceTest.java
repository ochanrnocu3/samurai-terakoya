import static org.junit.Assert.*;

import org.junit.Test;

public class PriceTest {
//	@Test public void setTypeWithNull() {
//		try {
//			Price nul = new Price();
//		} catch (NullPointerException e) {
//			return;
//		}
//		fail();
//	}
	 @Test
     public void testStudent() {
		 Price stu = new Price();
//		 stu.customerType = "student";
         System.out.println("学生の価格は" + stu.calcPrice("student"));
         assertEquals(500, stu.calcPrice("student"),0);
     }
	 @Test
	 public void testToddler() {
		 Price tod = new Price();
//		 tod.customerType = "toddler";
         System.out.println("幼児の価格は" + tod.calcPrice("toddler"));
         assertEquals(250,tod.calcPrice("toddler"),0);
     }
	 @Test
	 public void testAdult() {
		 Price adu = new Price();
//         adu.customerType = "adult";
         System.out.println("一般の価格は" + adu.calcPrice("adult"));
         assertEquals(1000,adu.calcPrice("adult"),0);
     }
	 @Test
		public void 例外確認() {
		 	Price price = new Price();
		 	assertThrows(NullPointerException.class, () -> price.calcPrice(null));
		}
}
