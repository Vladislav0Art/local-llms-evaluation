package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;

public class GeneratedTestAppendKeyVal_MultipleFields {

    @Test
    public void testAppendKeyVal_MultipleFields() {
        String inputUrl = "http://example.com/path?param1=value1&param2=value2";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key", "value");
        }});
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("another_key", "another_value");
        }}); // Multiple fields
        URI uri = urlBuilder.build();
        assertEquals("http://example.com/path?param1=value1&param2=value2&another_key=another_value", uri.toString(), "URL representation is correct");
    }

}