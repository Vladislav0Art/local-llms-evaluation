package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void urlBuilderConstructorTest() throws Exception {
        URL u = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("value", builder.u.getQuery());
    }

}