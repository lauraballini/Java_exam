public class UsaContoNew
	{
		public static void main(String[] args)
 			{  int x; int y;
			 ContoNew c1 = new ContoNew("de paperoni","paperon");
			 ContoNew c2 = new ContoNew("paolino", "paperino", 10);
			 c1.versa(100);
			 c2.versa(20);
			 x=c1.preleva(15);
			 System.out.println(x);
			 y=c2.preleva(50);
			 System.out.println(y);

			 }
	 }
