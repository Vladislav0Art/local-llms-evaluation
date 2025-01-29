package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_build_url_without_key {

    @Test
    public void test_build_url_without_key() {
        String inputUrl = "https://example.com";
        URL expected = new URL("https://example.com");
        URL actual = new UrlBuilder(inputUrl).build();
        assertEquals(expected, actual);
    }

}