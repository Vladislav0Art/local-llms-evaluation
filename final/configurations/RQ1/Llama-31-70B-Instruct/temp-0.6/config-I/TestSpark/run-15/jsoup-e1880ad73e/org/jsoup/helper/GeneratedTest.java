package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testInitialize() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, builder.u);
        assertEquals(null, builder.q);
    }

}