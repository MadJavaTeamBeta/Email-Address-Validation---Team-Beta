package email;

/**
 * Project: Email Address Validation - Team Beta
 * Class: EmailValidator
 * Created by Meesh
 * 12/16/15
 */

import javax.ws.rs.*;
import org.apache.log4j.Logger;
import javax.ws.rs.core.MediaType;

@Path("/EmailValidation")
public class EmailValidator {
    private final Logger logger = Logger.getLogger(this.getClass());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String showInstructions() {
        return "Enter an email address in the url to validate";
    }

    @GET
    @Path("/json/{emailAddress}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Email isEmailValidJson(@PathParam("emailAddress") String emailAddress) {
        logger.info("address: " + emailAddress);
        return ValidationResource.validate(emailAddress);
    }

    @GET
    @Path("/xml/{emailAddress}")
    @Produces({MediaType.APPLICATION_XML})
    public Email isEmailValidHtml(@PathParam("emailAddress") String emailAddress) {
        logger.info("address: " + emailAddress);
        return ValidationResource.validate(emailAddress);
    }
}