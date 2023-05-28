package Utility;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Info {
	
	static NumberFormat FormatandoValores = new DecimalFormat("£ #,##0.00");

	public static String doubletoString(Double value) {
		return FormatandoValores.format(value);
	}
		
}
