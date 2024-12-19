package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedBuildUrlWithNonAsciiPathTest {

    @Test
    public void buildUrlWithNonAsciiPathTest() throws Exception {
        URL url = new URL("http://localhost:8080/ä%EF%BC%81test?query=%3F%2Bfoo=bar#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals(new URL("http://localhost:8080/%C3%A4%FC%83%9C%83%8Etest?query=%3F%26%7C%2Bfoo=bar#fragment"), result, 1e-9);
    }

}