package DataAccessObject;

import java.io.Serializable;
import java.util.Map;

public class VanDAO implements IVanDAO<String>
{
	Map<String, Van> vanMap;
	Map<String, Customer> customerMap;

	@Override
	public void add(String vanRegNumber)
	{
		vanMap.put(vanRegNumber, new Van(vanRegNumber));
	}

	@Override
	public void update(String vanRegNumber)
	{
		vanMap.remove(vanRegNumber, new Van(vanRegNumber));
	}

	@Override
	public void remove(String vanRegNumber)
	{
		vanMap.remove(vanRegNumber);
	}

	@Override
	public String get(String vanRegNumber)
	{
		return (String) vanMap.get(vanRegNumber).getLicensePalte();
	}
}
