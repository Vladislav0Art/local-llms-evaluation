package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedAppendKeyValTest_ThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyValTest_ThrowsUnsupportedEncodingException() throws UnsupportedEncodingException, MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal("MockKey", "MockValue");
    }

}