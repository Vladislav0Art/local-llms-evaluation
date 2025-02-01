package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePartUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws Exception {
        URL url = new URL("http://test.com?utf=\uD83C\uDF59");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}