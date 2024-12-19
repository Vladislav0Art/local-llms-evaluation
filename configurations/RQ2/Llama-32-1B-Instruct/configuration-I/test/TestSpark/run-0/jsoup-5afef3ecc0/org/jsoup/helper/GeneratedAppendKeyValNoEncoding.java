package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class GeneratedAppendKeyValNoEncoding {

    @Test
    public void appendKeyValNoEncoding() throws IOException {
        String input = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "value");
        }}, true);
        assertEquals("https://example.com?key=value", urlBuilder.build().toString());
    }

}