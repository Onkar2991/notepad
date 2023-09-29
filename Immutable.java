final class Immutable
{
  private final int a =10;
  private final int b= 20;

  public int getA()
  {
	System.out.println("the value of a : "+a);
	return a;
  }
  
  public int getB()
  {
	System.out.println("the value of b : "+b);
	return b;
  }

  Immutable(int a , int b)
  {
     System.out.println("constructor called");
  }
  
  public static void main(String[] args)
  {
     Immutable ab= new Immutable(30,40);
     ab.getA();
     ab.getB();

	

   
  }
}