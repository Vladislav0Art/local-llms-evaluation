package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException {
        URL mockUrl = Mockito.mock(URL.class);
        UrlBuilder urlBuilder = new UrlBuilder(mockUrl);
        urlBuilder.appendKeyVal(null);
    }

}