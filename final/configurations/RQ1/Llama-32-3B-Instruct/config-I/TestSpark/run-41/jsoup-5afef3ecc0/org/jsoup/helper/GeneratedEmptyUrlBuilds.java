package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedEmptyUrlBuilds {

    @Test
    public void emptyUrlBuilds() throws MalformedURLException {
        URL u = null;
        UrlBuilder builder = new UrlBuilder(u);
        URL built = builder.build();
        assertNotNull(built);
        assertEquals("", built.getProtocol());
        assertEquals(null, built.getUserInfo());
        assertEquals("", built.getHost());
        assertEquals(-1, built.getPort());
        assertEquals("", built.getPath());
    }

}