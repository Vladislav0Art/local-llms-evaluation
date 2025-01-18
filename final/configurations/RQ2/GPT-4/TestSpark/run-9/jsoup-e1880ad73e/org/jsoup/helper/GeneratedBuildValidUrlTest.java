package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildValidUrlTest {

    @Test
    public void buildValidUrlTest() throws Exception {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com", resultUrl.toString());
    }

}