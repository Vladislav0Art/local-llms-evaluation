package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTestAppendKeyValNull {

    @Test
    public void testAppendKeyValNull() {
        String inputString = null;
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

}