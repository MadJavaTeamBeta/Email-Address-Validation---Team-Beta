package email;

/**
 * Project: Email Address Validation - Team Beta
 * Class:
 * Created by Meesh
 * 12/17/15
 */

import org.apache.log4j.Logger;

public class ValidationResource {
    private final Logger logger = Logger.getLogger(this.getClass());

    public static Email validate(String emailAddress) {
        Email email = new Email();
            try {
                email.setEmailAddress(emailAddress);
                email.setIsValid(parseRegex(emailAddress));
            } catch (Exception e) {
                //logger.info("isEmailValidJson", e);
                email.setIsValid(false);
            }
        return email;
    }

    public static boolean parseRegex(String emailAddress) {
        java.util.regex.Matcher m = null;
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        try {
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
            m = p.matcher(emailAddress);
        } catch (Exception e) {
            //logger.error("parseRegex exception", e);
        }
        return m.matches();
    }
}

