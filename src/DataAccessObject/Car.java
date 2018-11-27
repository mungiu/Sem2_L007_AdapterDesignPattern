package DataAccessObject;

public class Car<String>
{
	private String licensePlate;

	public Car(String licensePlate)
	{
		this.licensePlate = licensePlate;
	}

	public String getLicensePlate()
	{
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate)
	{
		this.licensePlate = licensePlate;
	}
}
