package com.animesh;

public class Pupppy 
{
	int pupppyAge;
	public Pupppy(String name) 
	{
		System.out.println("Name is:" +name);
		}
		public void setAge(int age){
			pupppyAge = age;
		}
		public int getAge(){
			System.out.println("Pupppy age is:" + pupppyAge);
			return pupppyAge;
			
		}


	public static void main(String[] args)
	{ Pupppy myPupppy=new Pupppy("tiger");
	myPupppy.setAge(2);
	myPupppy.getAge();
	System.out.println("variable values:" +myPupppy.pupppyAge);
		// TODO Auto-generated method stub

	}

}
