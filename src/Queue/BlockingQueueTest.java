package Queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlockingQueueTest<T> extends Object
{
	BlockingQueue<T> testQueue;

	//Runs before ever test method automatically
	@Before
	public void setup() throws Exception
	{
		testQueue = new BlockingQueue<T>();
	}

	//The test methods
	@Test
	public void putTest()
	{
		assertEquals(10, testQueue.size());
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");

		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");

		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");

		testQueue.put("asd");
		testQueue.put("asd");
	}

	@Test
	public void takeTest()
	{
		testQueue.put("asd");
		assertEquals("asd", testQueue.take());
		assertEquals(null, testQueue.take());
	}

	@Test
	public void isEmptyTest()
	{
		assertEquals(true, testQueue.isEmpty());
	}

	@Test
	public void isFullTest()
	{
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		testQueue.put("asd");
		assertEquals(true, testQueue.isFull());
	}
}
