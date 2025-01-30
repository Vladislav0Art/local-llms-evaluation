package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithQueryStringTest {

    @Test
    public void buildWithQueryStringTest() throws Exception {
        URL url = new URL("http://example.com?param=value");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        assertNotNull(result);
        assertEquals("http://example.com?param=value", result.toString());
    }

}