package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_WorksWithInvalidUrl {

    @Test
    public void build_WorksWithInvalidUrl() throws MalformedURLException {
        String url = "http://example.com";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        try {
            new URI(builder.build().toString());
            fail("Expected exception");
        } catch (MalformedURLException e) {
            // Expected
        }
    }

}