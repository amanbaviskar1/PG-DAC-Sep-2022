class A8
{
public static void main(String args[])
{
   for(int i=1;i<=5;i++) //for rows
  {
    //for spaces...
	for(int k=4;k>=i;k--)
	{
	System.out.print("$");
	}
    //for stars..
	for(int j=5;j>=i;j--)
	{
	System.out.print(j+" ");
    }
    System.out.println();
  } 


}

}