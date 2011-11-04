package com.microsoft.azure.services.blob;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateMapper {
    private static final String RFC1123_PATTERN = "EEE, dd MMM yyyy HH:mm:ss z";

    public String format(Date date) {
        return getFormat().format(date);
    }

    public Date parse(String date) throws ParseException {
        return getFormat().parse(date);
    }

    public Date parseNoThrow(String date) {
        try {
            return parse(date);
        }
        catch (ParseException e) {
            //TODO: Is it better to return null or throw a runtime exception?
            return null;
        }
    }

    private DateFormat getFormat() {
        DateFormat rfc1123Format = new SimpleDateFormat(RFC1123_PATTERN, Locale.US);
        rfc1123Format.setTimeZone(TimeZone.getTimeZone("GMT"));
        return rfc1123Format;
    }
}
