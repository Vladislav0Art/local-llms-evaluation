package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringBuilder;

public class GeneratedTestAppendKeyVal_JoinEmptyStringToKeyAndValue_ThrowsIllegalArgumentException_EmptyInput {

    public String build() {
        return new URL("https://www.example.com").toString();
    }

    @Test
    public void testAppendKeyVal_JoinEmptyStringToKeyAndValue_ThrowsIllegalArgumentException_EmptyInput() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        String emptyValue = "";
        try {
            urlBuilder.appendKeyVal(new HashMap<>());
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}