import java.io.IOException;

public class Battle {

    private Cohort player;
    private Cohort enemy;
    private RandomGenerator generator;

    public Battle(Cohort player, Cohort enemy) {
        this.player = player;
        this.enemy = enemy;
        this.generator = new RandomGenerator(1,10);
    }

    public void battle() {
        int counter = 1;
        for (int i = 0 ; i < 15; i++) {
            round(i);
            System.out.println(matchInfo());
            if (getPlayer().getSoldiers() < 0 || getEnemy().getSoldiers() < 0) {
                System.out.println(getPlayer());
                System.out.println(getEnemy());
                break;
            }
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    public void round(int roundNum) {
        System.out.println("Round "+ roundNum);
        if (ifPlayerHasFirstAttack()) {
            playerAttack();
            enemyAttackFirst();
        } else {
            enemyAttackFirst();
            playerAttack();
        }
    }

    private String matchInfo() {
        return getPlayer().getName() + ": " + getPlayer().getSoldiers() + " soldiers alive" + "\n" +
                getEnemy().getName() + ": " + getEnemy().getSoldiers() + " soldiers alive" + "\n" ;
    }

    private void playerAttack() {
        System.out.println("You have attack");
        if (ifPlayerAttackCorrectly()) {
            int casualties = getMinorCasualties(15,55);
            System.out.println("You have attacked well - "+ getEnemy().getName() +" cohort has lost "  + casualties + " men");
            updateManCount(getEnemy(),casualties);
        } else {
            int casualties = getMinorCasualties(5,15);
            System.out.println("Your attack was not successful - "+ getEnemy().getName() +" cohort has lost about "  + casualties + " men");
            updateManCount(getEnemy(),casualties);
        }
    }

    private void updateManCount(Cohort cohort, int casualties) {
        cohort.setSoldiers(cohort.getSoldiers() - casualties);
    }

    private void enemyAttackFirst() {
        System.out.println(getEnemy().getName() + " has attack");
        if (ifPlayerHasDefendedCorrect()) {
            int casualties = getMinorCasualties(5,15);
            System.out.println("You have defended well - only " + casualties + " man died");
            updateManCount(getPlayer(),casualties);
        } else {
            int casualties = getMinorCasualties(15,55);
            System.out.println("You have defended with casualties - " + casualties + " man died");
            updateManCount(getPlayer(),casualties);
        }
    }

    private int getMinorCasualties(int min, int max) {
        RandomGenerator gene2 = new RandomGenerator(min,max);
        return gene2.nextInt();
    }

    private boolean ifPlayerAttackCorrectly() {
        return generator.nextInt() <= 6;
    }

    private boolean ifPlayerHasDefendedCorrect() {
        return generator.nextInt() <= 5;
    }

    private boolean ifPlayerHasFirstAttack() {
        return generator.nextInt()  <= 5;
    }

    public Cohort getPlayer() {
        return player;
    }

    public void setPlayer(Cohort player) {
        this.player = player;
    }

    public Cohort getEnemy() {
        return enemy;
    }

    public void setEnemy(Cohort enemy) {
        this.enemy = enemy;
    }

    public RandomGenerator getGenerator() {
        return generator;
    }

    public void setGenerator(RandomGenerator generator) {
        this.generator = generator;
    }
}
