public class Battle {

    private Cohort player;
    private Cohort enemy;

    public Battle(Cohort player, Cohort enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void battle() {
        int counter = 1;
        if (player.getSoldiers() > 0) {
            System.out.println("Round "+ counter)
        }
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
}
