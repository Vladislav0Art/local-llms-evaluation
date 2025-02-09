package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            new UrlBuilder(inputUrl);
        } catch (java.net.MalformedURLException e) {
            Assert.fail();
        }
    }

    @Test
    public void UrlBuilderConstructorNullInputTest() {
        try {
            new UrlBuilder(null);
            Assert.fail();
        } catch (NullPointerException e) {
            Assert.assertEquals("URL input couldn't be null", e.getMessage());
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("key");
            when(kv.value()).thenReturn("value");

            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void appendKeyValEncodeErrorTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("\uD800\uDFFF"); // unpaired surrogate
            when(kv.value()).thenReturn("value");

            UrlBuilder builder = new UrlBuilder(inputUrl);
            builder.appendKeyVal(kv);
            Assert.fail();
        } catch (UnsupportedEncodingException e) {
            Assert.assertEquals("Invalid input string detected", e.getMessage());
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("https://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            Assert.assertEquals(inputUrl, builder.build());
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void buildOnBuildBaseUrlTest() {
        try {
            URL inputUrl = new URL("https://www.example.com/path");
            URL expected = new URL("https://www.example.com");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            Assert.assertEquals(expected, builder.build());
        } catch (Exception e) {
            Assert.fail();
        }
    }

}