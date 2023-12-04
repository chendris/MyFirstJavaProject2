public class JavaMethods {
    public static void main(String[] args) {
        printHello();
        weLearn();
        helloName("Andrei");
        getSum(2,3);
        getProduct(2,3);
        getSum(2,3,5);
        getSum(2.3, 5.6);
        helloNameAge("Andrei",26);
        friends("Andrei","Razvan");
        System.out.println(getSuM(7,9));
        System.out.println(getProducT(5,5));
        System.out.println(areMere("Ana"));

    }
    private static void printHello(){
        System.out.println("Hello World");
    }
    private static void weLearn(){
        System.out.println("We Learned About Methods");
    }
    private static void helloName(String name){
        System.out.println("Hello " +name);
    }

    private static void helloNameAge(String name, int age){
        System.out.println(name+" is "+age+" years old");
    }
    private static void getSum(int x, int y){
        System.out.println(x+y);
    }
    private static void getProduct(int x, int y){
        System.out.println(x*y);
    }

    private static void getSum(int x, int y, int z){
        System.out.println(x+y+z);
    }

    private static void getSum(double x, double y){
        System.out.println(x+y);
    }

    private static void friends(String name1, String name2){
        System.out.println(name1+" and "+name2+" are friends");
    }

    public static int getSuM(int x, int y) {
        int sum = x + y;
        return sum;
    }
    public static int getProducT(int x, int y){
        return x*y;
    }
    private static String areMere(String nume){
      return(nume+" are mere");
    }
}


