package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendQueryWithNonEmptyValue {

    @Test
    public void appendQueryWithNonEmptyValue() throws Exception {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> query = new HashMap<>();
        query.put("query", "value");

        // Act
        builder.appendKeyVal(builder.getQueryParams().add("query", "value"));

        // Assert
        assertNotNull(query);
        assertEquals(1, query.size());
        assertEquals("value", query.values().iterator().next());
    }

}