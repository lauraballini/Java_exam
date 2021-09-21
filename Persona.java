public class Persona {
  private String cognome;
  private String nome;
  public Persona(String a, String b)
		{ cognome=a; nome=b;
		}


    public String getNome()
        {return nome;}
  public String getCognome()
	    {return cognome;}
  public void setNome(String a)
            {nome=a;}
  public void reset()
            {cognome=""; nome=""; }
  public void setCognome(String a)
            {cognome=a;}
}
