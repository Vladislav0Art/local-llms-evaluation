package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderURLInputTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            assertNotNull(urlBuilder);
        } catch (MalformedURLException ex) {
            fail("MalformedURLException thrown: " + ex.getMessage());
        }
    }

    @Test
    public void UrlBuilderNullInputTest() {
        new UrlBuilder(null);
    }

    @Test
    public void buildLocalhostURLTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL builtUrl = urlBuilder.build();
            assertEquals(inputUrl.toString(), builtUrl.toString());
        } catch (MalformedURLException ex) {
            fail("MalformedURLException thrown: " + ex.getMessage());
        }
    }

    @Test
    public void appendKeyValUTFEncodingTest() {
        try {
            URL inputUrl = new URL("http://localhost");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(keyVal.toString()).thenReturn("key=value");

            urlBuilder.appendKeyVal(keyVal);
            URL builtUrl = urlBuilder.build();

            assertTrue(builtUrl.toString().contains("key=value"));
        } catch (MalformedURLException | UnsupportedEncodingException ex) {
            fail("Exception thrown: " + ex.getMessage());
        }
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = null;
        try {
            inputUrl = new URL("http://localhost");
        } catch (MalformedURLException ex) {
            fail("MalformedURLException thrown: " + ex.getMessage());
        }
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.toString()).thenReturn(new String(new byte[]{(byte) 0xFFFFFFFF}, "US-ASCII"));

        urlBuilder.appendKeyVal(keyVal);
    }

}