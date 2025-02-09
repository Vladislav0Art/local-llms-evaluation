package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValThrowsNullPointerExceptionWhenNullPassedTest {

    @Test
    public void appendKeyValThrowsNullPointerExceptionWhenNullPassedTest() throws UnsupportedEncodingException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        builder.appendKeyVal(null);
    }

}