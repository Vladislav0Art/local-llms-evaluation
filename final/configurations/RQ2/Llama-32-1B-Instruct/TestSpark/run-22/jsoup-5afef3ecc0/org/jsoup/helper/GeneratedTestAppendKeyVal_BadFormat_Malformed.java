package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class GeneratedTestAppendKeyVal_BadFormat_Malformed {

    @Test
    public void testAppendKeyVal_BadFormat_Malformed() {
        String inputUrl = "http://example.com/path?param1=value1&bad_field=malformed_value";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        try {
            urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
                put("key", "value");
            }}); // Malformed key
        } catch (UnsupportedEncodingException e) {
        }
    }

}