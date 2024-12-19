package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class GeneratedUrlBuilder {

    @Test
    public void urlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        assertEquals("https://example.com", urlBuilder.build().toString());
    }

}