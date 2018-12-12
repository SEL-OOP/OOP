package encapsulation;

public class TestDriver {

	public static void main(String[] args) {
		
		Driver per1 = new Driver();
		per1.setDriverAge(25);
		per1.setDriverName("Jony");
		System.out.println(per1.getDriverAge() + " " + per1.getDriverName());
		per1.setDriverId(56);

	}

}
