package epam.customcollection;
import java.util.*;
import java.io.*;
public class UseCustomList<T>
{

	CustomList<String> list=new CustomList<String>();
	public void add(String item)
	{
		list.add(item);
	}
	public void remove(int index)
	{
		list.remove(index);
	}
	public int length()
	{
		return list.size();
	}
	public String print()
	{
		return list.toString();
	}
	public String get(int index)
	{
		return list.get(index);
		
	}
}
