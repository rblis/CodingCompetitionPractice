import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;

public class ProblemHOrnaments {
	public static void main(String [] args)
	{	
		Scanner console = new Scanner (System.in);
		double length;
		double r = console.nextDouble();
		double h = console.nextDouble();
		double s = (console.nextDouble()/100 + 1);
		double angle;
		while(true)
		{
			angle = Math.acos(r/h);
			length = 2* Math.sqrt(h*h - r*r);
			angle *= 2;
			angle = Math.toDegrees(angle);
			length += r*2*Math.PI*(360-angle)/360;
			length *= s;
			length = Math.round(length * 100.0) / 100.0;
			DecimalFormat df = new DecimalFormat("0.00##");
			String result = df.format(length);
			System.out.println(result);
			r = console.nextInt();
			h = console.nextInt();
			s = console.nextDouble();
			
			if (r == 0 && h == 0 && s == 0)
				break;
			s = (s/100.0 + 1);
		}
		
		
		
	}
}
