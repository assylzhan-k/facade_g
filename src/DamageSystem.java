public class DamageSystem {
    public int calculateDamage(int baseDamage, int bonusDamage) {
        return baseDamage + bonusDamage;
    }
    public int applyDamage(int health, int damage) {
        return Math.max(0, health - damage);
    }
}
