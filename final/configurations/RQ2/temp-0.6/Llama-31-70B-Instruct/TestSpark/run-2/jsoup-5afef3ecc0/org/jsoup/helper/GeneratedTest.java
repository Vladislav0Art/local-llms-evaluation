package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://www.example.com");

        URL actualUrl = urlBuilder.build();

        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);

        urlBuilder.appendKeyVal(kv);
    }

}