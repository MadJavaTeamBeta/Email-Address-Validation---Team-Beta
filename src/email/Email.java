package email;

/**
 * Project: Email Address Validation - Team Beta
 * Class:
 * Created by Meesh
 * 12/16/15
 */

import org.apache.log4j.Logger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Email {
    private final Logger logger = Logger.getLogger(this.getClass());
    private String emailAddress;
    private boolean isValid;

    public Email() {
        logger.info("Created Empty 'Email' object");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Email - email: "+getEmailAddress()+" valid: "+getIsValid();
    }
}

