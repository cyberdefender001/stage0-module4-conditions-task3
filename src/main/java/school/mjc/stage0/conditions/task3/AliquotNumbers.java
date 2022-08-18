package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void isFirstAliquot(int first, int second) {
        int sum = 0;
        for(int i = 1; i < first; i++) {
            if (first % i == 0) {
                sum += i;
            }
        }
        if (sum == second) {
            System.out.println ("Aliquot");
        } else if (sum == 0) {
            System.out.println("Not aliquot");
        } else {
            isFirstAliquot(sum,second);
        }
        
    }
    public static void main(String[] args) {
        isFirstAliquot(12,4);
    }
}
