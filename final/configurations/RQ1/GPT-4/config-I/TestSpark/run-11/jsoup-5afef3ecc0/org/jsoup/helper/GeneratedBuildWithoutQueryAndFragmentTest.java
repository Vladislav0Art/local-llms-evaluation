package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildWithoutQueryAndFragmentTest {

    @Test
    public void buildWithoutQueryAndFragmentTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://testurl.com"));
            URL url = urlBuilder.build();
            assertEquals("http://testurl.com", url.toString());
        } catch (Exception e) {
            fail("Exception " + e);
        }
    }

}