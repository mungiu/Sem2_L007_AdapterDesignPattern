package DataAccessObject;

import java.io.IOException;

public class Main
{
	public static void main(String[] args)
	{
		MyFileIO myFileIO = new MyFileIO();
		VanDAO vanDAO = new VanDAO();
		vanDAO.add("testVanRegNumberWhichWilLAutomaticallyCreateAVan");

		try
		{
			myFileIO.writeToFile("BinaryDB", vanDAO.get("testVanRegNumberWhichWilLAutomaticallyCreateAVan"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
