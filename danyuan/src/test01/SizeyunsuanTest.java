package test01;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SizeyunsuanTest {
	@DataProvider(name="add")
	public  Object[][] data(){
	return new Object[][] {{"150","100","50"},{"100","50","25"},{"80","40","20"}};
	}
  @Test(dataProvider="add")
  public void Aadd(String test1,String test2,String test3) {
	  System.out.println(test1);
	  System.out.println(test2);
	  System.out.println(test3);
	  }
  @Test(dataProvider="sub")
  public void Bsub(String test1,String test2,String test3) {
		  System.out.println(test1);
		  System.out.println(test2);
		  System.out.println(test3);
		  }
  @Test(dataProvider="mul")
  public void Cmul(String test1,String test2,String test3) {
			  System.out.println(test1);
			  System.out.println(test2);
			  System.out.println(test3);
			  }
  @Test(dataProvider="div")
  public void Ddiv(String test1,String test2,String test3) {
			  System.out.println(test1);
			  System.out.println(test2);
			  System.out.println(test3);
  }
  }
	
    
	

