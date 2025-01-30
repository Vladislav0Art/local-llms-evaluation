package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePartThrowsUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartThrowsUnsupportedEncodingExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/שלום");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
    }

}