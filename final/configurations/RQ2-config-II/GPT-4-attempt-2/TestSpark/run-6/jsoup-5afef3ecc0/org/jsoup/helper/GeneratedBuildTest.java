package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://test.url");
        UrlBuilder builder = new UrlBuilder(url);
        URL buildUrl = builder.build();
        assertEquals("Built url should match the input url", url, buildUrl);
    }

}