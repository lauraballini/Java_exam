public class ContoNew {
  private Persona titolare;
  private int cifra;
  private int operazioni;
  public ContoNew(String a, String b)
		{ titolare= new Persona(a,b); cifra=0; operazioni=0;
		}

		public ContoNew(String a, String b, int disp)
    { titolare= new Persona(a,b); cifra=disp; operazioni=0;
    }

    public String getNome()
        {return titolare.getNome();}
  public String getCognome()
	    {return titolare.getCognome();}
  public int disponibile()
    	    {return cifra;}
  public void setNome(String a)
            {titolare.setNome(a);}
  public void reset()
            {titolare.reset(); cifra=0; operazioni=0;}
  public void setCognome(String a)
            {titolare.setCognome(a);}
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
