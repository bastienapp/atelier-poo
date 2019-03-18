public class Arena {

    public static void main(String[] args) {
    
        Monster jeremy = new Monster("jeremy", 30, 100);
        Monster sebastien = new Monster("sebastien", 25, 100);

        while (!jeremy.isKo() && sebastien.isKo()) {
            sebastien.takeHit(jeremy.getAttack());
            if (!sebastien.isKo()) {
                jeremy.takeHit(sebastien.getAttack());
            }
        }
        if (jeremy.isKo()) {
            System.out.println("jeremy is ko ");
        } else {
            System.out.println("sebastien is ko ");
        }
    }
}
