package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlBuilder_constructUrlFromInputUrl {

    @Test
    public void UrlBuilder_constructUrlFromInputUrl() throws URISyntaxException {
        String input = "https://www.example.com";
        URL expected = new URL(input);
        UrlBuilder builder = new UrlBuilder(new URL(input));
        assertEquals(expected, builder.build());
    }

}