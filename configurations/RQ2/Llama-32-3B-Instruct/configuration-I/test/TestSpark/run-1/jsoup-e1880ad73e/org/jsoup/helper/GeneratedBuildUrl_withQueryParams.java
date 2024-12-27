package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.EnumSet;

public class GeneratedBuildUrl_withQueryParams {

    @Test
    public void buildUrl_withQueryParams() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com?param=value"));
        assertEquals(new URL("https://example.com?param=value"), builder.build());
    }

}