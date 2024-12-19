package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class GeneratedAppendKeyValNoValue {

    @Test
    public void appendKeyValNoValue() {
        String input = "key";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "");
        }}, true));
    }

}