package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildWithFragmentTest {

    @Test
    public void buildWithFragmentTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://testurl.com#fragment"));
            URL url = urlBuilder.build();
            assertEquals("http://testurl.com#fragment", url.toString());
        } catch (Exception e) {
            fail("Exception " + e);
        }
    }

}