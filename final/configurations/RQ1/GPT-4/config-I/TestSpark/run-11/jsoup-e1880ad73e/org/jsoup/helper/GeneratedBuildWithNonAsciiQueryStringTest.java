package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithNonAsciiQueryStringTest {

    @Test
    public void buildWithNonAsciiQueryStringTest() throws Exception {
        URL url = new URL("http://example.com?param=значение");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();

        assertNotNull(result);
        assertEquals("http://example.com?param=%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5", result.toString());
    }

}