import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int treshold) {
        this.threshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : source) {
            if (integer > threshold) {
                logger.log("Элемент " + integer + " проходит");
                result.add(integer);
            } else {
                logger.log("Элемент " + integer + " не проходит");
            }

        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}
