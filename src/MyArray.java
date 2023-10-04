public class MyArray {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4};
        String [] myStringArray = {"Unu","Doi","Trei","Patru"};
        //System.out.println(myStringArray[2]);
        for (int i=0; i<myStringArray.length ; i++){
            System.out.println(myStringArray[i]);
        }
        //Ex4
        double [] myDoubleArray = {11,22,33,44};
        System.out.println("Elementul de pe a doua pozitie este " + (int)myDoubleArray[1]);
        System.out.println("Elementul de ultima pozitie este " + (int)myDoubleArray[myDoubleArray.length-1]);
        System.out.println("Numarul de elemente din sir este " + (myDoubleArray.length));

        //Ex5 optional
        char [] myCharArray = {'a','b','c','d'};
        System.out.println("elementul de pe prima pozitie este: " + myCharArray[0]);
        System.out.println("elementul de pe a doua pozitie este: " + myCharArray[1]);
        System.out.println("elementul de pe ultima pozitie este: " + myCharArray[myCharArray.length-1]);
        System.out.print("Toate elementele sirului:");
        for (int i=0; i<myCharArray.length; i++){
            System.out.print(" " + myCharArray[i]);
        }
    }
}
