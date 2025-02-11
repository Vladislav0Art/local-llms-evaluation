package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class Generated[UrlBuilderConstructor][]

constructor {

    @Test
    public void [UrlBuilderConstructor][]constructor() {
        URL u = new URL("http://example.com/path?query#fragment");
        UrlBuilder builder = new UrlBuilder(u);

        assertSame(builder.u, u);
        assertNull(builder.q);

        UrlBuilder builder2 = new UrlBuilder(u);
        assertNull(builder2.u);
        assertNotNull(builder2.q);

        UrlBuilder builder3 = new UrlBuilder(new URL("http://example.com/path?query#fragment"));
        assertEquals(builder3.u, u);
    }

}