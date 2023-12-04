import java.text.DecimalFormat;

public class Tema_Methods {
    public static void main(String[] args) {
        System.out.println("Inversul numarului  "+invers(-2));
        System.out.println("Maximul numerelor  "+maxim(25,20));
        System.out.println("Media aritmetica  "+String.format("%.2f",media_aritm(2,3,5)));
        System.out.println("Lungimea Stringului   "+ lungimeString("programare"));
        System.out.println("Stringuri Concatenate   "+ concatenat("Ana"," are mere"));
        System.out.println("String invers  : "+ invers("mare"));
        ninge();
        System.out.println("Numar par   "+paritate(7));
        System.out.println("Anotimp   "+anotimp("aprilie"));
        System.out.println("Anotimp   "+anotimp("iunie"));
        System.out.println("Anotimp   "+anotimp("noiembrie"));
        System.out.println("Anotimp   "+anotimp("ianuarie"));
        System.out.println("Maxim 4 numere   "+maxim4(5,3,8,6));
        System.out.println("Caracterul din mijloc   "+ mijloc("andrei"));
        System.out.println("Suma cifrelor   "+ sumaCifre(255));

    }

    //Ex1
    private static int invers(int x){
        return (x*(-1));
    }
    //Ex2
    private static int maxim(int x,int y){
        if (x>y) return x;
        else return y;
    }
    //Ex3
    private static double media_aritm(int x, int y, int z){
        double media =(x+y+z)/3.0;
        return(media);
    }
    //Ex4
    private static int lungimeString(String s){
        return(s.length());
    }
    //Ex5
    private static String concatenat(String s,String v){
        return(s.concat(v));
    }
    //Ex 6
    private static String invers(String s){
        String v="";
        char [] caractere=s.toCharArray();
        for (int i=s.length()-1;i>=0;i--){
            v+=caractere[i];
        }
        return v;
    }

    //Ex optional 1
    private static void ninge(){
        System.out.println("In sfarsit ninge!");
    }
    //Ex optional 2
    private static boolean paritate(int x){
        if (x%2==0) return true;
        else return false;
    }
    //Ex optional 3
    private static String anotimp(String s){
        if(s=="martie"||s=="aprilie"||s=="mai") return("primavara");
        else if (s=="iunie"||s=="iulie"||s=="august") return("vara");
        else if (s=="septembrie"||s=="octombrie"||s=="noiembrie") return ("toamna");
        else if (s=="decembrie"||s=="ianuarie"||s=="februarie") return ("iarna");
        else return("unknown");


    }

    //Ex optional 4
    private static int maxim1(int x,int y){
        if (x>y) return x;
        else if (y>x) return y;
        else return x;
    }

    //Ex optional 5
    private static int maxim4(int x, int y, int z, int w){
        int maxim=x;
        if (maxim<y) maxim=y;
        else if (maxim<z) maxim=z;
        else if (maxim<w) maxim =w;
        return maxim;

        }
    //Ex optional 6
    private static String mijloc(String s){
        if (s.length()%2!=0)
        return (String.valueOf(s.charAt(s.length()/2)));
        else return (String.valueOf(s.charAt((s.length()/2)-1)+String.valueOf(s.charAt(s.length()/2))));
    }

    //Ex optional 8
    private static int sumaCifre(int x){
        int suma=0;
        while(x>0){
            suma=suma+x%10;
            x=x/10;
        }
    return suma;
    }
    }


