package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithValidURLTest {

    @Test
    public void buildWithValidURLTest() throws Exception {
        URL testUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        URL resultUrl = builder.build();

        assertEquals(testUrl, resultUrl);
    }

}