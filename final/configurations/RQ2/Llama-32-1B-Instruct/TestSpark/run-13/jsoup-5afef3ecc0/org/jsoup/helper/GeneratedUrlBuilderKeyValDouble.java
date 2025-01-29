package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderKeyValDouble {

    @Test
    public void urlBuilderKeyValDouble() {
        double d = 3.14;
        assertNotEquals("https://example.com?k=2&v=3.14", new URLBuilder().appendKeyVal(Map.of("k", String.valueOf(d), "v", String.valueOf(d))));
    }

}