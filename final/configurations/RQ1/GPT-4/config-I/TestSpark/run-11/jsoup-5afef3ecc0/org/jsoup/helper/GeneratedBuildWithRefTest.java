package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildWithRefTest {

    @Test
    public void buildWithRefTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("https://test.com#ref"));
            URL url = urlBuilder.build();
            assertEquals("https://test.com#ref", url.toString());
        } catch (Exception e) {
            fail("This test should not raise an exception");
        }
    }

}