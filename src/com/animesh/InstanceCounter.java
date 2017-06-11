package com.animesh;

public class InstanceCounter {
	private static int numInstances = 0;
			protected static int getCount(){
				return numInstances;
			}
public static void addInstance(){
	numInstances++;
}
InstanceCounter(){
	InstanceCounter.addInstance();
}
	public static void main(String[] args) {
		System.out.println("Starting with"+ InstanceCounter.getCount()+"instance");
		for(int i=0;i<500;++i)
			
		{
			new InstanceCounter();
		}
		System.out.println("Created"+InstanceCounter.getCount()+"instances");
		// TODO Auto-generated method stub

	}

}
