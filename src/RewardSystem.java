public class RewardSystem {
    public int calculateReward(int enemyHealth) {
        if (enemyHealth <= 0) {
            return 100;
        }
        return 0;
    }
}
