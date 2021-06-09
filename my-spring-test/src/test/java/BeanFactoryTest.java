import bean.MyTestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest" +
				".xml"));

		//抽象类 AbstractBeanFactory getBean 方法
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		System.out.println(myTestBean.getTestStr());


	}

}
