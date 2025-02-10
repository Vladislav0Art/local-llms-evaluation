package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestUrlEncoding {

    @Test
    public void testUrlEncoding() {
        String baseUrl = "http://example.com";
        Map<String, String> params = new HashMap<>();
        params.put("key", "value");
        params.put("param1", "value1");

        URI uri = Main.builder.appendKeyVal(params);
        assertEquals(baseUrl + "?key=value&param1=value1", uri.toString());
    }

}