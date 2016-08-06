/* File name : EncapTest.java */
package assignment4;

import java.util.Date;

public class cAssignment3{

   private String aName;
   private String aID;
   private int aAge; 
   private int aSalary;
   private Date aDOB;
   private Date aDateOfJoining;
   
   
   public int getAge(){
      return aAge;
   }

   public String getName(){
      return aName;
   }

   public String getIdNum(){
      return aID;
   }

   public void setAge( int pNewAge){
	   aAge = pNewAge;
   }

   public void setName(String pNewName){
	   aName = pNewName;
   }

   public void setIdNum( String pNewID){
	   aID = pNewID;
   }
   
   
   public static void main(String args[])
   {
	      cAssignment3 lEncapClass = new cAssignment3();
	      lEncapClass.setName("James");
	      lEncapClass.setAge(20);
	      lEncapClass.setIdNum("AAA12345");

	      System.out.print("Name : " + lEncapClass.getName() + " Age : " + lEncapClass.getAge());
	}

	public int mGetSalary() 
	{
		return aSalary;
	}
	
	public void mSetSalary(int aSalary) 
	{
		this.aSalary = aSalary;
	}
	
	public Date mGetDOB() 
	{
		return aDOB;
	}
	
	public void mSetDOB(Date aDOB) 
	{
		this.aDOB = aDOB;
	}
	
	public Date mGetDOJ() 
	{
		return aDateOfJoining;
	}
	
	public void mSetDOJ(Date aDateOfJoining) 
	{
		this.aDateOfJoining = aDateOfJoining;
	}
}