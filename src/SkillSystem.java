public class SkillSystem {
    public boolean canUseSkill(int energy) {
        return energy >= 20;
    }
    public int useSkill(int energy) {
        return energy - 20;
    }
}
