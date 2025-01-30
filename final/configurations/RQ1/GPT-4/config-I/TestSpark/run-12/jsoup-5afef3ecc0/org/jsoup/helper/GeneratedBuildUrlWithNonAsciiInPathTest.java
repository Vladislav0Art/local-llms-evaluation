package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithNonAsciiInPathTest {

    @Test
    public void buildUrlWithNonAsciiInPathTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com:8080/tસંપtest?param=value#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals("https://www.example.com:8080/t%E0%AA%B8%E0%AA%82%E0%AA%AAtest?param=value#ref", result.toString());
    }

}