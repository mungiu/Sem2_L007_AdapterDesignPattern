package Queue;

public class BlockingQueue<T> implements Buffer
{
	private Queue<T> queue;
	private int capacity;

	public BlockingQueue()
	{
		queue = new Queue<T>(10);
		capacity = queue.getCapacity();
	}

	@Override
	public void put(Object element)
	{
		if (!isFull())
			queue.enqueue(element);
	}

	@Override
	public Object take()
	{
		if (isEmpty())
			return null;
		else
			return queue.dequeue();
	}

	@Override
	public Object look()
	{
		return queue.first();
	}

	@Override
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}

	@Override
	public boolean isFull()
	{
		return queue.size() >= capacity;
	}

	@Override
	public int size()
	{
		return capacity;
	}
}
