package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class GeneratedToEncodedStringReturnsUrlEncodedKeyAndValuePairs {

    @Test
    public void toEncodedStringReturnsUrlEncodedKeyAndValuePairs() throws UnsupportedEncodingException {
        String encoded = "key=value";
        assertEquals(encoded, Connection.KeyVal.of("key", "value").toEncodedString());
    }

}