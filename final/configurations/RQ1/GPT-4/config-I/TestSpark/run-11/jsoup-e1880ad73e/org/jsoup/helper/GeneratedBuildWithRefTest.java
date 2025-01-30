package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithRefTest {

    @Test
    public void buildWithRefTest() throws Exception {
        URL url = new URL("http://example.com#ref");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        assertNotNull(result);
        assertEquals("http://example.com#ref", result.toString());
    }

}