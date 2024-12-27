package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.EnumSet;

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        assertEquals(new URL("https://example.com"), builder.build());
    }

}