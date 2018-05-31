public class GameTest {

    public static void main(String[] args) {
        RandomGenerator generator = new RandomGenerator(1,10) ;

        Cohort oddzial = new Cohort("XII",false);
        Cohort wrog = new Cohort("Gauls",true);
        System.out.println(oddzial);
        System.out.println(wrog);
    }
}
