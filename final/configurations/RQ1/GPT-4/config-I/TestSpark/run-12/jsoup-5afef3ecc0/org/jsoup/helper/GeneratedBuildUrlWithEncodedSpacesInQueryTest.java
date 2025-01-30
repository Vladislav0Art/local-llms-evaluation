package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithEncodedSpacesInQueryTest {

    @Test
    public void buildUrlWithEncodedSpacesInQueryTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/test?param=value+with+spaces");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals("https://www.example.com/test?param=value+with+spaces", result.toString());
    }

}