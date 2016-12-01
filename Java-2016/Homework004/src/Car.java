
public abstract class Car implements Vehicle{
	
	private int fuelTankSize;
	private String fuelType;
	
	private int gear;
	private double consumptionPer100Km;
	
	private double availableFuel;
	private int tireSize;
	
	private String chassiesNumber;
	
	public int consumptionStat;
	
	public int kmDrive;
	public int percentageGearShift;
	
	public int curentGear;

	public Car(int fuelTankSize, String fuelType, int gear, double consumptionPer100Km, String chassiesNumber) {
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.gear = gear;
		this.consumptionPer100Km = consumptionPer100Km;
		this.chassiesNumber = chassiesNumber;
	}
	

	public double getAvailableFuel() {
		return availableFuel;
	}


	public void setAvailableFuel(double availableFuel) {
		this.availableFuel = availableFuel;
	}


	public int getTireSize() {
		return tireSize;
	}


	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}


	public int getFuelTankSize() {
		return fuelTankSize;
	}


	public String getFuelType() {
		return fuelType;
	}


	public int getGear() {
		return gear;
	}


	public double getConsumptionPer100Km() {
		return consumptionPer100Km;
	}


	public String getChassiesNumber() {
		return chassiesNumber;
	}


	@Override
	public void start() {
		System.out.println("Masina Porneste"); 
		this.consumptionStat=0;
		this.kmDrive=0;
		
		
	}

	@Override
	public void stop() {
		System.out.println("Masina se opreste");
		System.out.println("Consumul este:"+this.consumptionStat+" litri");
		setAvailableFuel(availableFuel-consumptionStat);
		
		
		
		
	}

	@Override
	public abstract void drive(double Km);
		
	
	public void shiftGear(int gear){
		if (gear<=this.gear)
			
		{
		System.out.println("Viteza s-a schimbat la" +gear);
		this.percentageGearShift=
		this.curentGear=gear;
		}
		else 
			System.out.println("Masina nu are treapta aleasa");
	}
		
		
	
	
	public abstract void averageFuelConsumption() ;
	
	
	

}
