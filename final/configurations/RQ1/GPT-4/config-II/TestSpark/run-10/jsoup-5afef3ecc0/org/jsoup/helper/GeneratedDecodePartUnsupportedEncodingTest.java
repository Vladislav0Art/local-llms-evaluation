package org.jsoup.helper;

import org.jsoup.Connection;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import java.net.URL;

public class GeneratedDecodePartUnsupportedEncodingTest {

    @Test
    public void decodePartUnsupportedEncodingTest() throws Exception {
        URL testUrl = new URL("http://domain.com?param=\uD83D\uDE0D");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        urlBuilder.build();
    }

}