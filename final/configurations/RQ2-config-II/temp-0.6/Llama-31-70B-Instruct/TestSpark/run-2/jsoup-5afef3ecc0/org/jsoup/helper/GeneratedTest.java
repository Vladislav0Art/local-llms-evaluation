package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void testBuild() throws Exception {
        URL initialUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(initialUrl);

        URL builtUrl = builder.build();

        assertNotNull(builtUrl);
        assertEquals("http", builtUrl.getProtocol());
        assertEquals("example.com", builtUrl.getHost());
    }

}