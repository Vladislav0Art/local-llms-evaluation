package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildTest_NullUrl_ThrowsException {

    @Test
    public void buildTest_NullUrl_ThrowsException() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        try {
            urlBuilder.build();
            fail();
        } catch (NullPointerException e) {
            assertTrue(e.getMessage().contains("URL must not be null"));
        }
    }

}