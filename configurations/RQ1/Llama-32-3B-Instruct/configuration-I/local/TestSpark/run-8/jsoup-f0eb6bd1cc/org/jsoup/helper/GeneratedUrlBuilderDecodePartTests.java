package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderDecodePartTests {

    @Test
    public void urlBuilderDecodePartTests() {
        String encoded = "https%3A%2F%2Fexample.com";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("https://example.com", decoded);
    }

}