import java.util.ArrayList;

public class Pro {

    // dynamic methods
    // for each

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //  System.out.println(dynaimcMethod(5,4,1,1,1,1,1,1,1,1,1,1,1));

        int[] a = {5,1,7,2,8,0};
        // System.out.println(for1(a));
        //  System.out.println(forEach(a));

        System.out.println(forLess(a));
        System.out.println(forEachLess(a));



        ArrayList<Integer> array = new ArrayList();
        array.add(2);
        array.add(1);
        array.add(4);
        array.add(6);
        array.add(8);

        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    static int dynaimcMethod(int ...num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];
        }
        return sum;
    }

    static int for1(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

    static int forEach(int[] num){
        int sum = 0;
        for (int i : num) {
            sum = sum + i;
        }
        return sum;
    }

    static int forLess(int[] num){

        int less = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < less) {
                less = num[i];
            }
        }
        return less;
    }

    static int forEachLess(int[] num){
        int less = num[0];
        for (int i : num) {
            if (i < less) {
                less = i;
            }
        }
        return less;
    }

}
