package kr.hs.emirim.forelise25.aopcal.main;

import org.springframework.util.ExceptionTypeFilter;

import kr.hs.emirim.forelise25.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.forelise25.aopcal.cal.ImpCalculator;
import kr.hs.emirim.forelise25.aopcal.cal.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttCal1.factorial(20));

		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(20));
	}

}
