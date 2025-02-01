package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        StringBuilder sb = new StringBuilder();
        builder.appendToAscii("test string", true, sb);
        assertEquals("test+string", sb.toString());
    }

}