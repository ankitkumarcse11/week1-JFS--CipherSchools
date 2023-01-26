package oops;

public class Student {
	String name;
	int age;
	String address;
	public Student(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}

//	public String toString()
//	{
//		return ("Student name is"+this.getName()+" age is"+this.getAge()+"address"+this.getAddress());
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ankit=new Student("ankit",22,"purnia");
//		System.out.println(ankit.toString());
		System.out.println(ankit.getName());		
		
		

	}

}
