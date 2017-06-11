//Enums were introduced in Java 5.0. Enums restrict a variable to have one of only a few predefined values. 
//The values in this enumerated list are called enums.


/*For example, if we consider an application for a fresh juice shop,
 *  it would be possible to restrict the glass size to small, medium, and large.
 *  This would make sure that it would not allow anyone to order any size other than small, medium, or large.
 */
package com.animesh;

public class FreshJuice 
{
	enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
		FreshJuiceSize size;

	public static void main(String[] args)
	{
		FreshJuice juice= new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.LARGE;
		/*comment type1 (single line comment)*/
		//comment type2(single line comment)
		/*multipe
		 * line
		 * comment type3
		 */
				System.out.println( "Size: "+ juice.size);
		// TODO Auto-generated method stub

	}

}
