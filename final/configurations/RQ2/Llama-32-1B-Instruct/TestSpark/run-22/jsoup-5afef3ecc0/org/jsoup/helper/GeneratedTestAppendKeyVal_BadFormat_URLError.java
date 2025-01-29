package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class GeneratedTestAppendKeyVal_BadFormat_URLError {

    @Test
    public void testAppendKeyVal_BadFormat_URLError() {
        String inputUrl = "http://example.com/path?param1=value1&bad/url";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
                put("key", "value");
            }}); // Malformed URL
        } catch (UnsupportedEncodingException e) {
        }
    }

}