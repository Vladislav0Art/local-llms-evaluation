package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.UrlBuilder;

public class GeneratedConstructorFromUrl_WithValidInput_ReturnsInstanceOfUrlBuilder {

    @Test
    public void constructorFromUrl_WithValidInput_ReturnsInstanceOfUrlBuilder() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertTrue(builder instanceof UrlBuilder);
    }

}