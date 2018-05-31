import java.util.PrimitiveIterator;
import java.util.Random;

public class RandomGenerator {
    private PrimitiveIterator.OfInt randomIterator;

    private int min;
    private int max;


    public RandomGenerator(int min, int max) {
        this.min = min;
        this.max = max;
        randomIterator = new Random().ints(getMin(),getMax()+1).iterator();
    }

    public void changeRanges(int min, int max) {
        setMax(max);
        setMin(min);
        randomIterator = new Random().ints(getMin(),getMax()+1).iterator();
    }

    public int nextInt() {
        return randomIterator.nextInt();
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
