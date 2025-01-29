package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTestAppendKeyValURLEncodedNull {

    @Test
    public void testAppendKeyValURLEncodedNull() {
        String inputString = "key1=value1&param2= value2";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

}