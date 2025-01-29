package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        String inputString = "key1=value1, key2=value2";
        String[] kvPairs = inputString.split(",");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        for (String kv : kvPairs) {
            assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
        }
    }

}