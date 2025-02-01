package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws Exception {
        URL inputUrl = new URL("http://google.com/%20"); // Encoding for space
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals(" ", builder.decodePart(inputUrl.getPath()));
    }

}