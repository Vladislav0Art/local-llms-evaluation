package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("https://test.com"));
            URL url = urlBuilder.build();
            assertEquals("https://test.com", url.toString());
        } catch (Exception e) {
            fail("This test should not raise an exception");
        }
    }

}