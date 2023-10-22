public class WarriorAdapter extends Warrior implements Character {
    @Override
    public void attack() {
        swordAttack();
    }
    @Override
    public void defend() {
        shieldDefend();
    }
    @Override
    public void scouting(){
        binocularsObserve();
    }
}
