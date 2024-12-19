package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedBuildUrlWithEncodingProblemsTest {

    @Test
    public void buildUrlWithEncodingProblemsTest() throws Exception {
        try {
            new UrlBuilder(new URL("http://localhost:8080/ä%EF%BC%81test?query=%3F%2Bfoo=bar#fragment"));
            fail();
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}