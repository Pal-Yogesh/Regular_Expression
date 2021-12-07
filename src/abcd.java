import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class abcd {
    public static void main(String[] args) {
        String target ="yogesh@gmail.com";
        Pattern P = Pattern.compile("[a-zA-Z0-9_.]+[@](gmail|yahoo|reddif)[.]com");
        Matcher m = P.matcher(target);
        int count = 0;
        while(m.find())
        {
            System.out.println(m.start()+"----"+m.end()+"----"+m.group());
            count++;
        }
        System.out.println(count);
    }
}
