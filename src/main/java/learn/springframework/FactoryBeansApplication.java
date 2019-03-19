package learn.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.springframework.controllers.ConstructorInjectedController;
import learn.springframework.controllers.GetterInjectedController;
import learn.springframework.controllers.MyController;
import learn.springframework.controllers.PropertyInjectedController;

@SpringBootApplication
public class FactoryBeansApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(FactoryBeansApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
