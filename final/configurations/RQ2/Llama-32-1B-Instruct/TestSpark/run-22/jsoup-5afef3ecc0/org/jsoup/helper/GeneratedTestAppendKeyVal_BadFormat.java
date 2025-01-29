package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class GeneratedTestAppendKeyVal_BadFormat {

    @Test
    public void testAppendKeyVal_BadFormat() {
        String inputUrl = "invalid/url";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
                put("key", "value");
            }}); // Invalid format
        } catch (UnsupportedEncodingException e) {
        }
    }

}