package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuild_NullQueryAndRefTest {

    @Test
    public void build_NullQueryAndRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

}