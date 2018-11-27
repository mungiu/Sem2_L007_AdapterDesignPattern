package Queue;

import java.util.ArrayList;

public class Queue<T> implements QueueADT
{
	private int capacity;
	private ArrayList<T> arrayList;

	public Queue(int capacity)
	{
		this.capacity = capacity;
		this.arrayList = new ArrayList<>(capacity);
	}

	public Queue()
	{
		this.arrayList = new ArrayList<>();
	}

	@Override
	public void enqueue(Object element)
	{
		arrayList.add((T) element);
	}

	@Override
	public T dequeue()
	{
		T temp = arrayList.get(0);
		arrayList.remove(0);
		return temp;
	}

	@Override
	public T first()
	{
		return arrayList.get(0);
	}

	@Override
	public int size()
	{
		return arrayList.size();
	}

	@Override
	public boolean isEmpty()
	{
		if (arrayList.isEmpty())
			return true;
		else
			return false;
	}

	@Override
	public int indexOf(Object element)
	{
		return arrayList.indexOf(element);
	}

	@Override
	public boolean contains(Object element)
	{
		return arrayList.contains(element);
	}

	@Override
	public String toString()
	{
		return arrayList.toString();
	}

	public int getCapacity()
	{
		return capacity;
	}
}
