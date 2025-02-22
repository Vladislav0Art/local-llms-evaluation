package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(urlBuilder.build());
    }

    @Test
    public void buildWithNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertThrows(NullPointerException.class, urlBuilder::build);
    }

    @Test
    public void buildWithMalformedUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("malformed_url"));
        assertThrows(MalformedURLException.class, urlBuilder::build);
    }

    @Test
    public void appendKeyValTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertNotNull(urlBuilder.q);
    }

    @Test
    public void appendKeyValWithNullKeyTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal(null, "value");
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(keyVal));
    }

}