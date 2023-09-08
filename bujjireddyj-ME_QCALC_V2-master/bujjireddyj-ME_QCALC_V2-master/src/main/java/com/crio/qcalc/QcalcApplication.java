package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		System.out.println("Starting QCalc..");

       StandardCalculator calc = new StandardCalculator();

       calc.add(3,8);

       calc.printResult();
       System.out.println(calc.getResult());
       LogicCalculator calc1 = new LogicCalculator();

       calc1.OR(8, 6);
       
       calc1.printResult();  
       LogicCalculator calc2 = new LogicCalculator();

calc2.AND(8, 6);

calc2.printResult();   
     
	}

}
