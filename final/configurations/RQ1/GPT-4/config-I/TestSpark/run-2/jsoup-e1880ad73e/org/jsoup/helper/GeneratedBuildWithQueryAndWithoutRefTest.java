package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithQueryAndWithoutRefTest {

    @Test
    public void buildWithQueryAndWithoutRefTest() throws Exception {
        URL u = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com?query=value", builder.build().toString());
    }

}