public class BattleFacade {
    private final CharacterSystem characterSystem = new CharacterSystem();
    private final SkillSystem skillSystem = new SkillSystem();
    private final ElementSystem elementSystem = new ElementSystem();
    private final DamageSystem damageSystem = new DamageSystem();
    private final RewardSystem rewardSystem = new RewardSystem();

    public void startBattle(String player, String enemy) {
        int playerHealth = 100;
        int enemyHealth = 50;
        int energy = 30;
        System.out.println(player + " fights " + enemy);
        if (!characterSystem.isAlive(playerHealth)) {
            System.out.println("Player cannot fight!");
            return;
        }
        if (!skillSystem.canUseSkill(energy)) {
            System.out.println("Not enough energy!");
            return;
        }
        energy = skillSystem.useSkill(energy);
        int bonus = elementSystem.getBonusDamage("Cryo");
        int damage = damageSystem.calculateDamage(40, bonus);
        enemyHealth = damageSystem.applyDamage(enemyHealth, damage);
        System.out.println("Damage dealt: " + damage);
        System.out.println("Enemy health: " + enemyHealth);
        System.out.println("Remaining energy: " + energy);
        int reward = rewardSystem.calculateReward(enemyHealth);
        System.out.println("Reward: " + reward + "mora");
    }
}
