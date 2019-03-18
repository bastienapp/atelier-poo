public class Monster {

    private String name;
    private int attack;
    private int life;

    public Monster(String nameV, int attackV, int lifeV) {
        this.name = nameV;
        this.attack = attackV;
        this.life = lifeV;
    }

    public String getName() {
        return this.name;
    } 
    
    public int getAttack() {
        return this.attack;
    }

    public int getLife() {
        return this.life;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    public void setLife(int newLife) {
        this.life = newLife;
    }

    public void takeHit(int attackAdversaire){
      setLife(getLife() - attackAdversaire);
       
    }

    public boolean isKo() {
        return !(getLife() > 0;
    }
}
