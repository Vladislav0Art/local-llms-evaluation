package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.example.com/foo/bar");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        StringBuilder sb = new StringBuilder();
        urlBuilder.appendToAscii("test", true, sb);
        assertEquals("test", sb.toString());
    }

}