package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com/"));
        URL url = urlBuilder.build();
        assertEquals("http://www.example.com/", url.toExternalForm());
    }

}