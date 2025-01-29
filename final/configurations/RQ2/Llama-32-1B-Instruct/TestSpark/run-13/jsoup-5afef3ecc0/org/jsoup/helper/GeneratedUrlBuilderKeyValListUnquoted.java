package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderKeyValListUnquoted {

    @Test
    public void urlBuilderKeyValListUnquoted() {
        List<String> list = Arrays.asList("key1", "value1");
        assertEquals("https://example.com?k=1&v=value1", new URLBuilder().appendKeyVal(list));
    }

}