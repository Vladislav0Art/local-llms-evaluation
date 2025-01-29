package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringBuilder;

public class GeneratedTestAppendKeyVal_JoinEmptyStringToKeyAndValue_ThrowsIllegalArgumentException {

    public String build() {
        return new URL("https://www.example.com").toString();
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue_ThrowsIllegalArgumentException() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        java.util.HashMap<String, String> emptyMap = new HashMap<>();
        try {
            urlBuilder.appendKeyVal(emptyMap);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}