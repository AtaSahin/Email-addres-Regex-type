import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingTheEmailPassword {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);

        return matcher.find();

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String text=scan.nextLine();
        System.out.println(validate(text));
        if(text.contains("@")){


            System.out.println("Right type of email address...");
        }
        else{
            System.out.println("try again");
        }

    }

}