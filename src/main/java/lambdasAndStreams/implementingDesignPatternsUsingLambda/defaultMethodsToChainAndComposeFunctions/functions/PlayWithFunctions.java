package lambdasAndStreams.implementingDesignPatternsUsingLambda.defaultMethodsToChainAndComposeFunctions.functions;

public class PlayWithFunctions {

    public static void main(String[] args) {
        Meteo meteo = new Meteo(20);

        Function<Meteo, Integer> readCelsius = m -> m.getTemperature();
        Function<Integer, Double> celsiusToFahrenheit = t -> t * 9d / 5d + 32d;

        Function<Meteo, Double> readFahrenheit = readCelsius.andThen(celsiusToFahrenheit);

        celsiusToFahrenheit.composing(readCelsius);

        System.out.println("Meteo is F " + readFahrenheit.apply(meteo));
    }
}
