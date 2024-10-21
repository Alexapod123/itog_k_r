package nursery.model;

public class Numeration {
    public static int count = 0;

    public static void nums(){
        count++;
    }

    public static void setCount(int a) {
        count = a;
    }

    public static int getCount() {
        return count;
    }
}
