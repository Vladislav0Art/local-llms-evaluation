package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithNonAsciiTest {

    @Test
    public void buildWithNonAsciiTest() throws Exception {
        URL url = new URL("http://example.com/年");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL expectedUrl = new URL("http://example.com/%E5%B9%B4");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}