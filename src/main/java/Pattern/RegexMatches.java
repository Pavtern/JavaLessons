package Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    private static String REGEX = "Собак";
    private static String INPUT = "Собака говорит мяу.";
    private static String REPLACE = "Чёрт, ";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);

        // получение matcher объекта
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}