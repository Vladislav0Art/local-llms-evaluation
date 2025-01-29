package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringBuilder;

public class GeneratedTestAppendKeyVal_JoinEmptyStringToKeyAndValue {

    public String build() {
        return new URL("https://www.example.com").toString();
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        java.util.HashMap<String, String> emptyMap = new HashMap<>();
        assertEquals("https://www.example.com?key1=value1&key2=value2", urlBuilder.appendKeyVal(emptyMap).toString());
    }

}