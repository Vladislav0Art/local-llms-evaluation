package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetParamsString {

    @Test
    public void getParamsString() throws Exception {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> query = new HashMap<>();
        query.put("key", "value");

        // Act
        String result = builder.getParamsString(query);

        // Assert
        assertEquals("key=value", result);
    }

}