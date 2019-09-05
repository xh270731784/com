import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("com-sdj");
		//zx
		BigDecimal a = new BigDecimal("83000");
		//ali+pufa
		BigDecimal b= new BigDecimal("27000");
		//laosij
		BigDecimal c= new BigDecimal("20000");
		//zhh
		BigDecimal d= new BigDecimal("10000");
		
		BigDecimal f = a.add(b);
		
		BigDecimal e = c.add(d);
		System.out.println(f.add(e));
	}

}
