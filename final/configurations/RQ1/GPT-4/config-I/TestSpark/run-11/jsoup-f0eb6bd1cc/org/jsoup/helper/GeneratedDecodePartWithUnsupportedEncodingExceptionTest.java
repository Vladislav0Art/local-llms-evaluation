package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection.KeyVal;

public class GeneratedDecodePartWithUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartWithUnsupportedEncodingExceptionTest() throws Exception {
        URL url = new URL("http://www.google.com/%");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}