package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_build_url_with_key_val {

    @Test
    public void test_build_url_with_key_val() throws UnsupportedEncodingException {
        String key = "name";
        String value = "John Doe";
        String inputUrl = "https://example.com";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        KeyVal kv = new KeyVal(key, value);
        URL actual = builder.build();
        assertEquals("https://example.com", URLDecoder.decode(actual));
    }

}