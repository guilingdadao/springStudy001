package springStudy001;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yeg.springmvc.demo.HelloService;

//配置加载spring的配置文件
@ContextConfiguration("classpath:META-INF/appContext.xml")
//加载spring的配置文件
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpring {
	
	@Resource
	private HelloService helloService;
	
	@Test
	public void testSayHello(){
		
		String msg = helloService.sayHello("spring");
		
		System.out.println(msg);
		Assert.assertTrue(true);
		
	}
	
	
}
