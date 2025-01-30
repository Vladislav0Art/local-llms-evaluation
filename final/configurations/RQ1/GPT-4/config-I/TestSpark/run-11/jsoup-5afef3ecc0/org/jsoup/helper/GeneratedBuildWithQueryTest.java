package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://testurl.com?query=value"));
            URL url = urlBuilder.build();
            assertEquals("http://testurl.com?query=value", url.toString());
        } catch (Exception e) {
            fail("Exception " + e);
        }
    }

}