package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL result = urlBuilder.build();

        assertNotNull(result);
        assertEquals("http://www.example.com", result.toString());
    }

}