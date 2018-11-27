package DataAccessObject;

public interface IVanDAO<T>
{
	void add(T obj);

	void update(T obj);

	void remove(T obj);

	T get(T obj);
}


