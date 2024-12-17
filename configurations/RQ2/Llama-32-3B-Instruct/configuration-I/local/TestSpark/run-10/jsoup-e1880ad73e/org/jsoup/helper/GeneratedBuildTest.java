package org.jsoup.helper;

import org.jsoup.helper.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildTest {

    @Test
    public void BuildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        URL builtUrl = urlBuilder.build();
        assertEquals("http://example.com", builtUrl.toString());
    }

}