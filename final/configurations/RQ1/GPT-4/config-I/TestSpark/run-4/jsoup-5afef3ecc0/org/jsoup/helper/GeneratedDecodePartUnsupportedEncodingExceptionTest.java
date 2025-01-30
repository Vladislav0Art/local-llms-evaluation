package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

public class GeneratedDecodePartUnsupportedEncodingExceptionTest {

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example%com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // This would thrown an RuntimeException for unsupported encoding
        urlBuilder.build();
    }

}