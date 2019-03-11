package test01;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.junit.Assert.assertEquals;
import org.testng.annotations.AfterClass;
public class countTestTest {
	count c=new count();
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
  public void AtestZhengchu10() {
c.zhengchu10(70);
  }
  @Test
  public void BtestZhengchu7() {
	  c.zhengchu7(70);
  }
 
}
