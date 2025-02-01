package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() {
        try {
            new UrlBuilder(new URL("http://localhost"));
        } catch (MalformedURLException e) {
            Assert.fail("UrlBuilder constructor test failed");
        }
    }

    @Test
    public void urlBuilderConstructorNullInputTest() {
        new UrlBuilder(null);
    }

    @Test
    public void buildTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost"));
            URL url = urlBuilder.build();
            Assert.assertEquals("http://localhost", url.toString());
        } catch (MalformedURLException e) {
            Assert.fail("Build test failed");
        }
    }

    @Test
    public void buildMalformedUrlTest() throws MalformedURLException, UnsupportedEncodingException, URISyntaxException {
        URL url = Mockito.mock(URL.class);
        Mockito.when(url.getProtocol()).thenThrow(new MalformedURLException());
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost"));
            urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
            URL url = urlBuilder.build();
            Assert.assertEquals("http://localhost?key=value", url.toString());
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            Assert.fail("AppendKeyVal test failed");
        }
    }

    @Test
    public void appendKeyValNullInputTest() throws UnsupportedEncodingException {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost"));
            urlBuilder.appendKeyVal(null);
        } catch (MalformedURLException e) {
            Assert.fail("Null Input for appendKeyVal test failed");
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException, MalformedURLException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenThrow(new UnsupportedEncodingException());
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost"));
        urlBuilder.appendKeyVal(keyVal);
    }

}