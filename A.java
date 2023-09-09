class A 
{
 public static void main(String args[])
 {
   int arr[] = new int[]{1,2,3,4,5}; 
   int arr1[] = new int[]{4,5,6,7,8};
   
  for(int i=0;i<arr.length;i++)
  {
    for(int j=i+1;j<arr1.length;j++)
    {
    	if(arr[i]==arr1[j])
    	{
	  System.out.println(arr[i]);
	}

    }     
  } 

 } 
}