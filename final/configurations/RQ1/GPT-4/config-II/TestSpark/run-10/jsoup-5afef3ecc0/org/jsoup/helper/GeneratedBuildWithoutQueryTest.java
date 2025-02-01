package org.jsoup.helper;

import org.jsoup.Connection;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import java.net.URL;

public class GeneratedBuildWithoutQueryTest {

    @Test
    public void buildWithoutQueryTest() throws Exception {
        URL testUrl = new URL("http://domain.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL builtUrl = urlBuilder.build();

        assertNotNull(builtUrl);
        assertEquals(testUrl, builtUrl);
    }

}