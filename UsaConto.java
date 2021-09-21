public class UsaConto
	{
		public static void main(String[] args)
 			{  int x; int y;
			 Conto c1 = new Conto("de paperoni","paperon");
			 Conto c2 = new Conto("paolino", "paperino", 10);
			 c1.versa(100);
			 c2.versa(20);
			 x=c1.preleva(15);
			 System.out.println(x);
			 y=c2.preleva(50);
			 System.out.println(y);

			 }
	 }
