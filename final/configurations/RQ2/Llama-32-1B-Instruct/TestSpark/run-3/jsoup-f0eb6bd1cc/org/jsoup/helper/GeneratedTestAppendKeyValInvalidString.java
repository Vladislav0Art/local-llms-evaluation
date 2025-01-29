package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyValInvalidString {

    @Test
    public void testAppendKeyValInvalidString() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        String key = "key";
        String invalidValue = "invalid value";
        urlBuilder.appendKeyVal(new Connection.KeyVal(key, invalidValue));
        assertEquals(key + "=" + invalidValue, urlBuilder.appendKeyVal(new Connection.KeyVal(key, "").toString()).toString());
    }

}