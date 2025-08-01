package com.sb.learn.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{
	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

	public static void main(String[] args) {
		try(var context = 
				new  AnnotationConfigApplicationContext
				(BeanScopesLauncherApplication.class)){
			
			//singleton scope - one object instance
			System.out.println(context.getBean(NormalClass.class));//NormalClass@2ca923bb
			System.out.println(context.getBean(NormalClass.class));//NormalClass@2ca923bb
			System.out.println(context.getBean(NormalClass.class));//NormalClass@2ca923bb
			System.out.println(context.getBean(NormalClass.class));//NormalClass@2ca923bb - same bean
			
			//prototype scope - many object instances
			// new instance of the bean is created for each time for prototype classes
			System.out.println(context.getBean(PrototypeClass.class));//PrototypeClass@13df2a8c
			System.out.println(context.getBean(PrototypeClass.class));//PrototypeClass@1ebea008
			System.out.println(context.getBean(PrototypeClass.class));//PrototypeClass@72d6b3ba
		}
	}
}