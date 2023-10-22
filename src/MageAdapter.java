public class MageAdapter extends Mage implements Character {
    @Override
    public void attack() {
        spellCast();
    }
    @Override
    public void defend() {
        barrierCast();
    }
    @Override
    public void scouting(){
        magicObserve();
    }
}
