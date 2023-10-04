public class DataTypes {
    public static void main(String[] args) {
        boolean bool = true;
        System.out.println(bool);
        char myChar = 'a';
        System.out.println(myChar);
        byte myByte = 0; // -128 - 127
        System.out.println(myByte);
        short myShort = 32767;
        System.out.println(myShort);
        float myFloat = (float)5.5; // sau 5.5f
        System.out.println(myFloat);
        double myDouble = 5.5;
        System.out.println(myDouble);
        String myString = "Calin Andrei Chedris";
        System.out.println("Lungimea numelui meu este: " + myString.length());
        String myNameWidouthSpace = myString.replace(" ", "");
        System.out.println("Lungimea numelui fara spatii este: " + myNameWidouthSpace.length());
        String myName = "andrei";
        System.out.println("a 4-a litera din nume este: "+ myName.charAt(3));
        //Ex1
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String muText = "Hello World";
        String myOtherText = "la2b3c";
        //Ex2
        byte myBite = 4;
        int cast = myBite;
        System.out.println(cast);
        float myFloar = 9.1f;
        int cast1 = (int) myFloar;
        System.out.println(cast1);
        //Ex 3
        String tara = "Romania";
        int lungime = tara.length()+1;
        System.out.println("lungimea numelui Romania este " + lungime);

        //Ex1 optional
        float x = 2.5f;
        float y = 3.2f;
        System.out.println("suma este: " + (x+y));
        System.out.println("diferenta este: " + (y-x));
        System.out.println("produsul etse: " + (x*y));

        //Ex 2 optional
        String myFavouriteMovie = "The Avengers";
        System.out.println("My favourite movie is  + \"" + myFavouriteMovie + "\"");

        //Ex 3 optional
        System.out.println(myFavouriteMovie.toLowerCase());
        System.out.println(myFavouriteMovie.toUpperCase());

        //Ex 4 optional
        System.out.println("lungimea stringului myFavouriteMovie este: " + myFavouriteMovie.length());








    }
}
