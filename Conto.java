public class Conto {
  private String cognome;
  private String nome;
  private int cifra;
  private int operazioni;
  public Conto(String a, String b)
		{ cognome=a; nome=b; cifra=0; operazioni=0;
		}

		public Conto(String a, String b, int disp)
    { cognome=a; nome=b; cifra=disp; operazioni=0;
    }

    public String getNome()
        {return nome;}
  public String getCognome()
	    {return cognome;}
  public int disponibile()
    	    {return cifra;}
  public void setNome(String a)
            {nome=a;}
  public void reset()
            {cognome=""; nome=""; cifra=0; operazioni=0;}
  public void setCognome(String a)
            {cognome=a;}
  public void versa(int x)
           {cifra=cifra+x; operazioni=operazioni+1;}
  private boolean verificaDisp(int disp)
            {boolean b = (cifra>disp); return b;}
  public int preleva(int y)
          { if (verificaDisp(y))
                {cifra=cifra-y; return cifra;}
               else {return -1;}
             }
}
