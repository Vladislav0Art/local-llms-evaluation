package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class GeneratedTestAppendKeyVal_SingleField {

    @Test
    public void testAppendKeyVal_SingleField() {
        String inputUrl = "http://example.com/path?param1=value1";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "value");
        }}); // Single field key-value pair
        URI uri = urlBuilder.build();
        assertEquals("http://example.com/path?param1=value1", uri.toString(), "URL representation is correct");
    }

}