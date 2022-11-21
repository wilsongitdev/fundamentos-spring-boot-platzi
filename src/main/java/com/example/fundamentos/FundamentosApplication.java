package com.example.fundamentos;

import com.example.fundamentos.bean.Bean;
import com.example.fundamentos.bean.MyBeanWithProperties;
import com.example.fundamentos.bean.dependency.MyBeanWithDependency;
import com.example.fundamentos.component.ComponentDependency;
import com.example.fundamentos.pojo.UserPojo;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
	private Bean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;

	private static Logger Log = LoggerFactory.getLogger(FundamentosApplication.class);

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
								  Bean myBean, MyBeanWithDependency myBeanWithDependency,
								  MyBeanWithProperties myBeanWithProperties, UserPojo userPojo){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.saludar();
		myBeanWithDependency.printWithDependency();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEdad() + " - " +userPojo.getEmail());

		Log.info("Cuidadito");
	}
}
