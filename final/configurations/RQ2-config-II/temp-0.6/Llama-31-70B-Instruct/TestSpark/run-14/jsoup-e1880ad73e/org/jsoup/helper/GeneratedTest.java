package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final String TEST_URL = "https://www.example.com/";

    @Mock
    private URL mockUrl;

    @Test
    public void buildUrlTest() throws IOException {
        when(mockUrl.getProtocol()).thenReturn("https");
        when(mockUrl.getHost()).thenReturn("www.example.com");
        when(mockUrl.getPath()).thenReturn("/");

        UrlBuilder builder = new UrlBuilder(mockUrl);
        URL builtUrl = builder.build();

        assertEquals("https", builtUrl.getProtocol());
        assertEquals("www.example.com", builtUrl.getHost());
        assertEquals("/", builtUrl.getPath());
    }

}