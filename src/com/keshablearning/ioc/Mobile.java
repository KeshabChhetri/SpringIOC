package com.keshablearning.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

//		Tmobile tm = new Tmobile();
//		tm.calling();
//		tm.data();
// 
//		Att att = new Att();
//		att.calling();
//		att.data(); 

//		Sim sim = new Att();//runtime polymorphysm(Dynamic method dispatch)
//		sim.calling();
//		sim.data();

// Using Spring IOC concept

ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


System.out.println("Config Loaded ");

Sim sm = context.getBean("Sim", Sim.class);
sm.calling();
sm.data();
	}

}
