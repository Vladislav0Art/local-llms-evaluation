package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartUnsupportedTest {

    @Test
    public void decodePartUnsupportedTest() throws Exception {
        URL url = new URL("http://example.com/年");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URLDecoder.decode(url.getHost(), "Unsupported");
    }

}