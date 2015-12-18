package email;

/**
 * Project: Email Address Validation - Team Beta
 * Class:
 * Created by Meesh
 * 12/17/15
 */

import java.util.ArrayList;
import java.util.HashMap;

public class EmailStore {
    private static EmailStore instance = null;
    private static HashMap<String, ArrayList<Email>> emailStore;
    protected static final String KEY = "emailStore";

    public static EmailStore getInstance() {
        if (instance == null) {
            instance = new EmailStore();
            emailStore = new HashMap();
            emailStore.put(KEY, new ArrayList<Email>());
        }
        return instance;
    }

    public HashMap<String, ArrayList<Email>> getEmailStore() {
        return emailStore;
    }

    public void addEmail(Email email) {
        emailStore.get(KEY).add(email);
    }

}

