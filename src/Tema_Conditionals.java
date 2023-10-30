import org.w3c.dom.ls.LSOutput;

public class Tema_Conditionals {
    public static void main(String[] args) {
        // Ex2
        for(int i=20;i>=10;i--){
            System.out.print(i+" ");

        }
        System.out.println();
        //EX3

        for(int j=0;j<=100;j++){
            if(j%2==0) System.out.print(j+ " ");
        }
        System.out.println();

        //EX4
        String fructe[]={"mar","capsune","pere", "banane"};
        for (String fruct: fructe) {
            System.out.println("Imi place sa mananc "+fruct);

        }

        //EX5
        int k= 11;
        switch (k){
            case 1: System.out.println("Ianuarie"); break;
            case 2: System.out.println("Februarie"); break;
            case 3: System.out.println("Martie"); break;
            case 4: System.out.println("Aprilie"); break;
            case 5: System.out.println("Mai"); break;
            case 6: System.out.println("Iunie"); break;
            case 7: System.out.println("Iulie"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("Septembrie"); break;
            case 10: System.out.println("Octombrie"); break;
            case 11: System.out.println("Noiembrie"); break;
            case 12: System.out.println("Decembrie"); break;
        }

        //EX 1 Optional
        int temperature= 18;
        if (temperature <18) System.out.println("prea frig");
        else if (temperature>=18 && temperature<=22) System.out.println("ok");
        else if (temperature>22) System.out.println("prea cald");

        //EX 2 Optional
        char gender = 'f';
        boolean married = false;
        if (gender == 'm') System.out.println("Domnul");
        if (gender== 'f')
            if (married==true) System.out.println("Doamna");
            else if (married == false) System.out.println("Domnisoara");

        //EX 3 Optional
        int x = 7;
        int y = 6;
        if (x>y) System.out.println(x);
        else if (y>x) System.out.println(y);
        else System.out.println("sunt egale");

        //EX 4 Optional
        int z=5;
        if (x>y && x>z) System.out.println(x);
            else if (y<x && y>z) System.out.println(y);
                else if (z>x && z>y) System.out.println(z);

        //EX 5 Optional
        char letter = 'b';
        char vocals[] ={'a','e','i','o','u'};
        boolean ok = false;
        for (char vocal:vocals) {
            if (vocal==letter) {ok=true;break;}
        }
        if (ok==true) System.out.println(letter+" este vocala");
        else System.out.println(letter+ " este consoana");






    }



}
