package org.jsoup.helper;

import org.jsoup.Connection;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import java.net.URL;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() throws Exception {
        URL testUrl = new URL("http://domain.com?param=space param");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL builtUrl = urlBuilder.build();

        URL expectedUrl = new URL("http://domain.com?param=space+param");

        assertNotNull(builtUrl);
        assertEquals(expectedUrl, builtUrl);
    }

}