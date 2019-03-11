package test01;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
public class SizeyunsuanTestng {
	Sizeyunsuan s=new Sizeyunsuan();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }
  @Test
  public void setUpBeforeClass() {
  }
  @Test
  public void tearDownAfterClass() {
  }
  @Test
  public void Atestadd() {
	 int result=s.add(2, 3);
	 Assert.assertEquals(result,5);
  }
  @Test
  public void Btestsub() {
	  int result=s.sub(20, 3);
		 Assert.assertEquals(result,17);
  }
  @Test
  public void Ctestmul() {  
	  int result=s.mul(2, 3);
		 Assert.assertEquals(result,6);
  }
  @Test
  public void Dtestdiv() { 
	  int result=s.div(18, 3);
		 Assert.assertEquals(result,6);
  }
}
