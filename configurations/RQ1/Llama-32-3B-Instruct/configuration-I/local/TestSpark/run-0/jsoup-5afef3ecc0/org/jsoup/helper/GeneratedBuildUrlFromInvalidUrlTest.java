package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlFromInvalidUrlTest {

    @Test
    public void buildUrlFromInvalidUrlTest() {
        URL url = new URL("invalid-url");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder.build());
    }

}