
package Login_Register.main;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class KiemTraEmail{
    Pattern pattern;
    Matcher matcher;
private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";// cấu trúc 1 email thông thường
 
    public KiemTraEmail() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
 
    // Class kiểm định dạng email
    public boolean validate(final String hex) {
 
        matcher = pattern.matcher(hex);
        return matcher.matches();
 
    }
 
    // main và test
    public static void main(String[] args) {
        String email = "fgdfgfg";
        KiemTraEmail validator = new KiemTraEmail();
        if (validator.validate(email)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }
}  
