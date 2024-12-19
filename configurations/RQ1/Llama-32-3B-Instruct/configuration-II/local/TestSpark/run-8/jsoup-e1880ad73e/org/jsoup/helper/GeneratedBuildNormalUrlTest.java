package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedBuildNormalUrlTest {

    @Test
    public void buildNormalUrlTest() throws Exception {
        URL url = new URL("http://localhost:8080/test?query=abc&foo=bar#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(new URL("http://localhost:8080/test?query=abc%26foo=bar#fragment"), result, 1e-9);
    }

}