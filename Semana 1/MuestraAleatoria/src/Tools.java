public class Tools {
public Tools() {
	 }
    //-----------------------------------------------
    public boolean EsCadenaNumerica(String CADENA) {
    boolean Sw;
    int i,N;
    char EE;
       Sw = true;
            N = CADENA.length();
            i=0;
            while((i<=N-1)&&(Sw==true)) {
                    EE = CADENA.charAt(i);
             /*if(!(('0'<=EE)&&(EE<='9'))) {
                  Sw = false;
               }*/
       Sw = (('0'<=EE)&&(EE<='9'));
                    i++;
            }
            return Sw;
    }
    //-----------------------------------------------
	 public boolean EsCadenaAlfabetica(String CADENA) {
	 boolean Sw;
	 int i,N;
	 char EE;
	    Sw = true;
		 N = CADENA.length();
		 i=0;
		 while((i<=N-1)&&(Sw==true)) {
			 EE = CADENA.charAt(i);
            Sw = ( ((65<=EE)&&(EE<=90))||
                 ((97<=EE)&&(EE<=122))||
                 (EE==32)||
                 (EE==165)||
                 (EE==164) );
			 i++;
		 }
		 return Sw;
	 }
}
