import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    List<Double> array1 = Arrays.asList(7.0,8.0, 10.0);
    List<Double> array2 = Arrays.asList(7.0,5.0, 2.0);

    public void suma(){

        AtomicInteger index = new AtomicInteger();
        if (array1.size() <= array2.size()){
            array1.stream()
                    .map(n1 ->{
                        return n1 + array2.get(index.getAndIncrement());
                    })

                    .forEach(n1 -> logger.info("la suma: " + n1.toString()));

        }else {
            array2.stream()
                    .map(n1 ->{
                        return n1 + array1.get(index.getAndIncrement());
                    })

                    .forEach(n1 -> logger.info("la suma: " + n1.toString()));
        }

    }
    public void resta(){

        AtomicInteger index = new AtomicInteger();
        if (array1.size() <= array2.size()){
            array1.stream()
                    .map(n1 ->{
                        return n1 - array2.get(index.getAndIncrement());
                    })

                    .forEach(n1 -> logger.info("la resta es:" + n1.toString()));
        }else {
            array2.stream()
                    .map(n1 ->{
                        return n1 - array1.get(index.getAndIncrement());
                    })

                    .forEach(n1 -> logger.info("la resta es:" + n1.toString()));

        }

    }
    public void multiplicar(){
        AtomicInteger index = new AtomicInteger();
        array1.stream()
                .map(n1 ->{
                    return n1 * array2.get(index.getAndIncrement());
                })

                .forEach(n1 -> logger.info("el factor es:" + n1.toString()));
    }

    public void Dividido(){
        AtomicInteger index = new AtomicInteger();
        if (array1.size() <= array2.size()){
            array1.stream()
                    .map(n1 ->{
                        return n1 / array2.get(index.getAndIncrement());
                    })

                    .forEach(n1 -> logger.info("la divicion es:" + n1.toString()));
        }else {
            array2.stream()
                    .map(n1 ->{
                        return n1 / array1.get(index.getAndIncrement());
                    })

                    .forEach(n1 -> logger.info("la divicion es:" + n1.toString()));
        }

    }
}
