package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedWithBothQueryAndRefUrlBuildsCorrectly {

    @Test
    public void withBothQueryAndRefUrlBuildsCorrectly() throws MalformedURLException {
        URL u = new URL("http://example.com/path?query=value&more=info#ref");
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("http", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("example.com", built.getHost());
        assertEquals(-1, built.getPort());
        assertTrue(built.getPath().contains("/path?query=value&more=info#ref"));
    }

}