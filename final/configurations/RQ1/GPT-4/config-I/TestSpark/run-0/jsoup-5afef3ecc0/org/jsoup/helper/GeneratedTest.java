package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Connection.KeyVal keyVal;

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://127.0.0.1/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://127.0.0.1/path?query=value", resultUrl.toString());
    }

    @Test
    public void buildWithHostTest() throws Exception {
        URL url = new URL("http://localhost/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://localhost/path?query=value", resultUrl.toString());
    }

    @Test
    public void buildHttpsTest() throws Exception {
        URL url = new URL("https://127.0.0.1/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();

        assertEquals("https://127.0.0.1/path?query=value", resultUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://127.0.0.1");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Mockito.when(keyVal.key()).thenReturn("newKey");
        Mockito.when(keyVal.value()).thenReturn("newValue");
        urlBuilder.appendKeyVal(keyVal);

        URL resultUrl = urlBuilder.build();

        assertEquals("http://127.0.0.1?newKey=newValue", resultUrl.toString());
    }

    @Test
    public void decodePartTest() throws Exception {
        URL url = new URL("http://127.0.0.1/this%Gis%a%test");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.build();

        // Expected to throw a RuntimeException
    }

}