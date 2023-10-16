public class Operatori {
    public static void main(String[] args) {
        int sum1 = 100+50;
        int sum2 = sum1+50;
        int sum3 = sum1+sum2;
        System.out.println(sum1 +" " + sum2+ " " + sum3);

        int num1 = 100;
        int num2 = 50;
       /* System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1*num2);
        System.out.println((num1+1)%num2);
        */
        //4.6 Tema
        //Ex 1,2,3,4
        System.out.println(10*6);
        System.out.println(10/5);
        int x=10;
        System.out.println(++x);
        int y=10;
        System.out.println(y+5);
        //Ex 5
        int z=5;
        int w=10;
        int sum=z+w;
        if (sum>=10) System.out.println("suma este mai mare decat 10");
                else System.out.println("suma este mai mica decat 10");

        //Ex 6
        if (sum % 2 ==0) System.out.println("suma este numar par");

    //Exercitii optionale
        //Ex1
    int var1=1;
    int var2=2;
    int var3=3;
    int var4=4;
        System.out.println("suma este: " + var1+var2+var3+var4);
        System.out.println("produsul este: " + var1*var2*var3*var4);
        System.out.println("restul impartirii: "+ var4%var2);

        //Ex2
    for (int i=0;i<=2;i++)
    {
        var1+=1;
    }
        System.out.println(var1);

        //Ex3
    for (int i=0;i<=1;i++)
    {
        var2--;
    }
        System.out.println(var2);

        //Ex4
    boolean cond1 = false;
    boolean cond2 =false;
    if(var1+var2+var3+var4 >100) cond1 = true;
        System.out.println(cond1);
    if (var1*var2*var3*var4 > 1000) cond2=true;
        System.out.println(cond2);

        //Ex5
    if(cond1==true || cond2==true) System.out.println("True");
    if(cond1==true && cond2==true) System.out.println("True");





///
    }
}
