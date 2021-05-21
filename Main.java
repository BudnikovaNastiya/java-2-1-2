public class Main {
    public static void main(String[] args) {
        int startingBalance = 100;
        int replenishment = 2200;
        int bonus = (replenishment > 1000) ? replenishment / 100 : 0;
        int total = startingBalance + replenishment + bonus;
        System.out.println(total);
    }
}
