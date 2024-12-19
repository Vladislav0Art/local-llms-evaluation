package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class GeneratedAppendKeyValNonStringKey {

    @Test
    public void appendKeyValNonStringKey() {
        String input = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put(1L, "value");
        }}, true));
    }

}