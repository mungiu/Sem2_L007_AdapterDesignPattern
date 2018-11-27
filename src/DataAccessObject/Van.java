package DataAccessObject;

import java.io.Serializable;

public class Van<T> extends Car<T> implements Serializable
{
	public Van(T licensePlate)
	{
		super(licensePlate);
	}

	public T getLicensePalte()
	{
		return super.getLicensePlate();
	}
}
