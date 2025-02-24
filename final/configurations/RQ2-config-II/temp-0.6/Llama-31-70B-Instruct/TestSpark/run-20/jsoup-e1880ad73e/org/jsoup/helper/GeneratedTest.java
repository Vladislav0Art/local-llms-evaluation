package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        URL url = urlBuilder.build();
        assertEquals("https", url.getProtocol());
        assertEquals("example.com", url.getHost());
        assertEquals(-1, url.getPort());
    }

    @Test
    public void appendKeyValTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertTrue(urlBuilder.build().toString().contains("key=value"));
    }

}