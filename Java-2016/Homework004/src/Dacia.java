
public class Dacia extends Car{
	
	public int consumptionPerGear;
		

	public Dacia(int fuelTankSize, String fuelType, int gear, double consumptionPer100Km, String chassiesNumber) {
		super(fuelTankSize, fuelType, gear, consumptionPer100Km, chassiesNumber);
	
	}

	@Override
	public void averageFuelConsumption() {
		
		
	}

	@Override
	public void drive(double Km) {
			System.out.println("Masina inainteaza "+Km );
			this.kmDrive+=Km;
			//this.consumptionStat+=
		
	}

	@Override
	public void shiftGear(int gear) {
		
		
	}
	
	public int setConsumptionPerGear(int gear){
		return 0;
	}
	

}
