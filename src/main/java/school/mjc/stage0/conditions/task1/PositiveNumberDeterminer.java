package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        if (numberToBeDetermined>0){
            System.out.println("positive");
        } else if (numberToBeDetermined<0) {
            System.out.println("negative");
        }
    }
    public static void main(String[] args) {
        PositiveNumberDeterminer determiner = new PositiveNumberDeterminer();
        int numberToBeDetermined = -6;
        determiner.isPositive(numberToBeDetermined);
    }
}
