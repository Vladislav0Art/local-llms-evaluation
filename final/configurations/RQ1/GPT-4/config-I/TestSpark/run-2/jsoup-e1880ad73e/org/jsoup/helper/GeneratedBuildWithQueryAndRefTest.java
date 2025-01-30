package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithQueryAndRefTest {

    @Test
    public void buildWithQueryAndRefTest() throws Exception {
        URL u = new URL("http://example.com?query=value#ref");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com?query=value#ref", builder.build().toString());
    }

}