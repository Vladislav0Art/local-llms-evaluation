package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            URL result = urlBuilder.build();
            assertNotNull(result);
            assertEquals("http", result.getProtocol());
            assertEquals("example.com", result.getHost());
        } catch (MalformedURLException e) {
            fail("Unexpected exception was thrown: " + e.getMessage());
        }
    }

}