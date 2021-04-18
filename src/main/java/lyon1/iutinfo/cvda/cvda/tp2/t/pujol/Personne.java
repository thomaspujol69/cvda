package lyon1.iutinfo.cvda.cvda.tp2.t.pujol;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.text.Normalizer;

public class Personne {
    private String nom; 
    private String Prénom;
    private GregorianCalendar ddn;
    private String e_mail;
    private String любимыйцвет; 
    
    public Personne() {
        this.nom="";
        this.Prénom="";
    }

    public String getLogin() throws IllegalStateException {
        String n= "";
        String p= "";
        if (!"".equals(Prénom)){
            p = Normalizer.normalize(Prénom.substring(0, 1), Normalizer.Form.NFD);
            p = p.replaceAll("[^\\p{ASCII}]", "");
        } 
        if (!"".equals(nom)){
            n = Normalizer.normalize(nom, Normalizer.Form.NFD);
            n = n.replaceAll("[^\\p{ASCII}]", "");
        }
        if("".equals(p+n)){
            throw new IllegalStateException();
        }
        return p+n;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) 
    {
        this.nom = cleanUpString(nom.toUpperCase());
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
    
    /* Méthode fortement inspirée de la méthode trim de la classe String */
    public String trimWithDash(String str) {  
        int len = str.length();  
        int st = 0;  
        char[] val = str.toCharArray(); 
  
        while ((st < len) && (val[st] <= '-')) {  
            st++;  
        }  
        while ((st < len) && (val[len - 1] <= '-')) {  
            len--;  
        }  
        return ((st > 0) || (len < str.length())) ? str.substring(st, len) : str;
    }
    
    public String cleanUpString(String str){
        String output;
        output=str.trim();
        output=trimWithDash(output);
        return output;
    }
    
    public String toPascalCase(String str){
        String[] séparateurs={" ", "-"};
        if (!str.equals("")){
            int i;
            String[] pList;
            for (String sepa: séparateurs){
                pList = str.split(sepa);
                str="";
                i=0;
                for (String s: pList){
                    if (i!=0){
                        str=str+sepa;
                    }
                    if (!s.equals("")){
                        str=str+s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                    }
                    i++;
                }
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
        if(m<=12 && d<=31){
            GregorianCalendar date=new GregorianCalendar(y, m, d);
            GregorianCalendar now= new GregorianCalendar();
            if (date.compareTo(now)>0){
                throw new IllegalArgumentException();
            }
            this.ddn = date;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public String getЛюбимыйцвет() {
        return любимыйцвет;
    }

    public void setЛюбимыйцвет(String любимыйцвет) {
        this.любимыйцвет = любимыйцвет;
    }
    
    
}
