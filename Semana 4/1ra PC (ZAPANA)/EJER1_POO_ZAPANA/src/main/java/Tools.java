import javax.swing.JOptionPane;

public class Tools {

    //-----------------------------------------------
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
    //-----------------------------------------------
    public boolean DNI_Ok(String pDNI) {
    boolean Sw;
       Sw = true;
        if(pDNI.length()==8) {
            if(EsCadenaNumerica(pDNI)==false) {
                Sw = false;
//                JOptionPane.showMessageDialog(null,"ERROR: El DNI contiene caracteres no numericos");
            }
        }else {
            Sw = false;
//            JOptionPane.showMessageDialog(null,"ERROR: El DNI debe tener 8 caracteres");
        }
        return Sw;
    }
    //-----------------------------------------------
    public boolean NomApe_Ok(String pNomApe) {
    boolean Sw;
        Sw = true;
        if(pNomApe.length()<=30) {
            if(EsCadenaAlfabetica(pNomApe)==false) {
                Sw = false;
                JOptionPane.showMessageDialog(null,"ERROR: El Nombre/Apellido contiene caracteres no alfabeticos");
            }
        }else {
            Sw = false;
            JOptionPane.showMessageDialog(null,"ERROR: El Nombre/Apellido es demasiado largo");
        }
        return Sw;
    }
    //-----------------------------------------------
    public boolean Direc_Ok(String pDirec) {
    boolean Sw;
        Sw = true;
        if(pDirec.length()<=100) {
            if(EsCadenaAlfabetica(pDirec)==false) {
                Sw = false;
                JOptionPane.showMessageDialog(null,"ERROR: El Nombre/Apellido contiene caracteres no alfabeticos");
            }
        }else {
            Sw = false;
            JOptionPane.showMessageDialog(null,"ERROR: El Nombre/Apellido es demasiado largo");
        }
        return Sw;
    }
    //-----------------------------------------------
    public boolean Telefono_Ok(String pTelefono) {
    boolean Sw;
        Sw = true;
        if(pTelefono.length()==9) {
            if(EsCadenaNumerica(pTelefono)==false) {
               Sw = false;
               JOptionPane.showMessageDialog(null,"ERROR: El Telefono contiene caracteres no numericos");
            }
        }
        else {
           Sw = false;
           JOptionPane.showMessageDialog(null,"ERROR: El Telefono debe tener 9 caracteres");
        }
        return Sw;
    }
    //-----------------------------------------------
    public boolean Edad_Ok(String pEdad) {
    boolean Sw;
       Sw = false;
       if(EsCadenaNumerica(pEdad)==true) {
           if(pEdad.length()==2) {
                if(Integer.parseInt(pEdad)<=75) {
                    Sw = true;
                }else {
                    JOptionPane.showMessageDialog(null,"ERROR: Error por Limite de Edad");
                }
           }else {
               JOptionPane.showMessageDialog(null,"ERROR: Error en tamaño de Edad");
           }
       }else {
          JOptionPane.showMessageDialog(null,"ERROR: La Edad contiene caracteres no numericos");
       }
       return Sw;
    }
    //-----------------------------------------------
     public boolean FecNac_Ok(String pFecNac) {
     boolean Sw;
     String DD,MM,YYYY;
     int Dia,Mes,Anio,TMP;
        Sw = false;
        if(pFecNac.length()==10) {
           if((pFecNac.charAt(2)=='/')&&(pFecNac.charAt(5)=='/')) {
              DD   = pFecNac.substring(0,2);
              MM   = pFecNac.substring(3,5);
              YYYY = pFecNac.substring(6,10);
              if(EsCadenaNumerica(DD+MM+YYYY)==true) {
                 Dia = Integer.parseInt(DD);
                 Mes = Integer.parseInt(MM);
                 Anio= Integer.parseInt(YYYY);
                 if((1950<=Anio)&&(Anio<=2010)) {
                     if((1<=Mes)&&(Mes<=12)) {
                        if((Mes==1)||(Mes==3)||(Mes==5)||(Mes==7)||(Mes==8)||(Mes==10)||(Mes==12)) {
                            if((1<=Dia)&&(Dia<=31)) {
                               Sw = true;
                            }else {
                                JOptionPane.showMessageDialog(null,"ERROR: Error en Dia de Nacimiento");
                            }
                        }else {
                           if((Mes==4)||(Mes==6)||(Mes==9)||(Mes==11)) {
                               if((1<=Dia)&&(Dia<=30)) {
                                   Sw = true;
                               }else {
                                    JOptionPane.showMessageDialog(null,"ERROR: Error en Dia de Nacimiento");
                               }
                           }else {
                               TMP = (Anio%4==0?29:28);
                               if((1<=Dia)&&(Dia<=TMP)) {
                                  Sw = true;
                               }else {
                                    JOptionPane.showMessageDialog(null,"ERROR: Error en Dia de Nacimiento");
                               }
                           }
                        }
                     }else {
                        JOptionPane.showMessageDialog(null,"ERROR: El Mes es Incorrecto");
                     }
                 }else {
                    JOptionPane.showMessageDialog(null,"ERROR: Año de Nacimiento fuera del Rango");
                 }
              }else {
                JOptionPane.showMessageDialog(null,"ERROR: La Fecha de Nacimiento contiene caracteres no numericos");
              }               
           }else {
                JOptionPane.showMessageDialog(null,"ERROR: Los delimitadores de Fecha de Nacimiento son incorrectos");
           }
        }else {
            JOptionPane.showMessageDialog(null,"ERROR: La Fecha de Nacimiento debe tener 10 caracteres");
        }
        return Sw;
    }
    //-----------------------------------------------
    public boolean Espec_Ok(String pEspec) {
    boolean Sw;
       Sw = true;
       if(pEspec.length()<=30) {
           if(EsCadenaAlfabetica(pEspec)==false) {
               Sw = false;
               JOptionPane.showMessageDialog(null,"ERROR: La especialidad contiene caracteres no alfabeticos");
           }
       }else {
           Sw = false;
           JOptionPane.showMessageDialog(null,"ERROR: La especialidad es demasiado largo");
       }
       return Sw;
    }
    //-----------------------------------------------
    public boolean Area_Ok(String pArea) {
    boolean Sw;
       Sw = true;
       if(pArea.length()<=30) {
           if(EsCadenaAlfabetica(pArea)==false) {
               Sw = false;
               JOptionPane.showMessageDialog(null,"ERROR: El área contiene caracteres no alfabeticos");
           }
       }else {
           Sw = false;
           JOptionPane.showMessageDialog(null,"ERROR: El área especialidad es demasiado largo");
       }
       return Sw;
    }
    //-----------------------------------------------
}
