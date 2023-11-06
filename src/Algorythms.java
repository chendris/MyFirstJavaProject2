public class Algorythms {
    public static void main(String[] args) {
        //Ex 1/2

        int numere[] = {1,-25,24,-2,67,5};
        for (int i=0;i< numere.length;i++){
            System.out.println((numere[i]-1)+ " "+ (numere[i]+1));
        }
        //Ex 3
        for (int i=0;i< numere.length;i++)
            if (numere[i]<0) System.out.print(numere[i]+" ");
        System.out.println();

        //Ex 4/5
        String tari[]={"Anglia","Romania","Albania","Franta","Elvetia","China","SUA","Australia"};
        for (String tara:tari) {
            System.out.print(tara.charAt(0)+" ");
        }
        System.out.println();

        //EX 6
        for (String tara: tari) {
            if (tara.charAt(0)=='A') System.out.print(tara+ " ");
            ;
        }
        System.out.println();

        //EX 7
        for (String tara: tari){
            System.out.println(tara+" are "+tara.length()+" litere");
        }

        //Ex8
        String compar = tari[0];
        for (String tara: tari) {

            if (tara.length() > compar.length()) compar=tara;
        }
        System.out.println("Tara cu cel mai lung nume este: "+compar);

        //Ex9
        String compar1 = tari[0];
        for (String tara: tari) {

            if (tara.length() < compar.length()) compar1=tara;
        }
        System.out.println("Tara cu cel mai scurt nume este: "+compar1);


    }
}
