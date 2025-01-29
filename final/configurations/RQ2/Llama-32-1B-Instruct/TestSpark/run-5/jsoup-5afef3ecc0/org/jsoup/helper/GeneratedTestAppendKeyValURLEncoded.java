package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTestAppendKeyValURLEncoded {

    @Test
    public void testAppendKeyValURLEncoded() {
        String inputString = "key1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertEquals("https%3A%2F%2Fexample.com/path%3Fparam1%3Dvalue1%26param2%3Dvalue2", urlBuilder.appendKeyVal(inputString));
    }

}