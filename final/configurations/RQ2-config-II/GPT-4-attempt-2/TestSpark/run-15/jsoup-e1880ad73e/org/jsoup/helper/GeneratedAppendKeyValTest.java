package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("test_key");
        Mockito.when(kv.value()).thenReturn("test_value");

        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);

        String expectedUrl = "http://example.com?test_key=" + URLEncoder.encode("test_value", "UTF-8");

        assertEquals("Append action should append key/value pairs as query parameters to the URL",
                expectedUrl, urlBuilder.build().toString());
    }

}