package logger;

/**
 * Project: Email Address Validation - Team Beta
 * Class: CustomFileAppender
 * Created by Meesh
 * 12/17/15
 */

import org.apache.log4j.FileAppender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomFileAppender extends FileAppender {

    @Override
    public void setFile(String fileName) {
        if (fileName.contains("%timestamp")) {
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("MM.dd.YYYY:HH.mm.ss.");
            fileName = fileName.replaceAll("%timestamp", format.format(date));
        }
        super.setFile(fileName);
    }
}
