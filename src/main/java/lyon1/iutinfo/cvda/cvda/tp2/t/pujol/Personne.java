package lyon1.iutinfo.cvda.cvda.tp2.t.pujol;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Personne {
    private String nom; private String Prénom;
    private GregorianCalendar ddn;
    private String e_mail;
    private String любимыйцвет; public Personne() {
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) 
    {
        this.nom = nom.toUpperCase();
            }

    public String getPrénom() {
        return Prénom;
    }
    
        public String get_email() {
        return e_mail;
    }

    public void set_email(String eMail){
        this.e_mail = eMail;
        return;
    }
    
    public String toPascalCase(String str){
        int i;
        String[] séparateurs={" ", "-"};
        for (String sepa: séparateurs){
            String[] pList = str.split(sepa);
            str="";
            i=0;
            for (String s: pList){
                if (i!=0){
                    str=str+sepa;
                }
                str=str+s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                i++;
            }
        }
        return str;
    }
    
    public void setPrénom(String prénom) {
        this.Prénom = toPascalCase(prénom);
    }

public GregorianCalendar getDdn() {
    return ddn;
}

            public void setDdn(int y, int m, int d) throws IllegalArgumentException
            {
                GregorianCalendar date=new GregorianCalendar(y, m, d);
                GregorianCalendar now= new GregorianCalendar();
                if (date.compareTo(now)>0){
                    throw new IllegalArgumentException();
                }
                this.ddn = date;
            }

    public String getЛюбимыйцвет() {
        return любимыйцвет;
    }

    public void setЛюбимыйцвет(String любимыйцвет) {
        this.любимыйцвет = любимыйцвет;
    }
    
    
}
