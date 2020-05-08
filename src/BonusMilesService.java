public class BonusMilesService {
    public int calculate(int cost) {
        int coins = 20;
        int bonus = cost / coins;

        return (int) bonus;
    }
}