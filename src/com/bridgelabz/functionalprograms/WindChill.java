package com.bridgelabz.functionalprograms;

public class WindChill {
	public static void main(String[] args) {
         
		/* Windchill temperature is defined only for temperatures at or below 10 °C (50 °F) 
		 * and wind speeds above 4.8 km/h (3.0 mph).
		 *  As the air temperature falls, the chilling effect of any wind that is present increases.
		 */
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);

		/* As our  formula is valid only for :
		 * "t" larger than 50 in absolute value 
		 * and  "v"  larger than 120 or less than 3.
		 */
		if (Math.abs(t) > 50 || v > 120 || v < 3) {
			System.out.println("The given temperature and wind speed is outside the valid range.");
			return;
		}

		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.printf("The wind chill is %.2f degrees Fahrenheit.", w);
	}

}
