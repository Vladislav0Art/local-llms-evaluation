package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValReturnsEmptyMap {

    @Test
    public void testAppendKeyValReturnsEmptyMap() {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Map<String, String> map = builder.appendKeyVal("key", "value");
        assertNotNull(map);
        assertEquals(1, map.size());
    }

}