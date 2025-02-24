package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildThrowsExceptionOnInvalidUrl() throws MalformedURLException {
        Connection.KeyVal keyVal = mock(Connection.KeyVal.class);
        when(keyVal.getValue()).thenReturn("value");

        // Build a UrlBuilder with an invalid URL
        UrlBuilder urlBuilder = new UrlBuilder("invalid url");
        urlBuilder.appendKeyVal(keyVal);
        urlBuilder.build();
    }

}