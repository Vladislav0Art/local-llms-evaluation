package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTestAppendKeyValMalformed {

    @Test
    public void testAppendKeyValMalformed() throws MalformedURLException {
        String inputString = "key1=value1&";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(inputString));
    }

}