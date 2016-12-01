
public class VW extends Car{

	public VW(int fuelTankSize, String fuelType, int gear, double consumptionPer100Km, String chassiesNumber) {
		super(fuelTankSize, fuelType, gear, consumptionPer100Km, chassiesNumber);
		
	}

	@Override
	public void averageFuelConsumption() {
		
		
	}

	@Override
	public void drive(double Km) {
		System.out.println("Masina inainteaza "+Km );
		
	}

	@Override
	public void shiftGear(int gear) {
		// TODO Auto-generated method stub
		
	}

}
