package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePartNullTest {

    @Test
    public void decodePartNullTest() throws MalformedURLException {
        URL url = new URL("http://exàmple.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        UrlBuilder.decodePart(null);
    }

}