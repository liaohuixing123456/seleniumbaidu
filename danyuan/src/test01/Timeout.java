package test01;
import org.testng.annotations.Test;
public class Timeout {
@Test(timeOut=2000)
public void cs() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println("hello world");
}
}
