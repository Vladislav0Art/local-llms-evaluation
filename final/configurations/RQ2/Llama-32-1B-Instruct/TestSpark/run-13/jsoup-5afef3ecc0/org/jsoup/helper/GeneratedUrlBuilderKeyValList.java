package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderKeyValList {

    @Test
    public void urlBuilderKeyValList() {
        List<String> list = Arrays.asList("a", "b");
        assertEquals("https://example.com?a=b", new URLBuilder().appendKeyVal(list));
    }

}