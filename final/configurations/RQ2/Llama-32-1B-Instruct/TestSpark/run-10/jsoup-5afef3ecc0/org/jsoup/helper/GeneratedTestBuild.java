package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String url = "https://example.com/path?key=value";
        URLBuilder builder = new UrlBuilder(url);
        assertEquals("https://example.com/path", builder.build().toString());
    }

}