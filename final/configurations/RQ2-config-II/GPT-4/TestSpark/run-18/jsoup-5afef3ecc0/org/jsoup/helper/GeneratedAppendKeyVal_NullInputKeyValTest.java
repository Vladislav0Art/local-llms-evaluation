package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyVal_NullInputKeyValTest {

    @Test
    public void appendKeyVal_NullInputKeyValTest() {
        try {
            URL url = new URL("http://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.appendKeyVal(null);
            Assert.fail("Expected an IllegalArgumentException to be thrown");
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            Assert.assertEquals("KeyVal cannot be null", e.getMessage());
        } catch (MalformedURLException e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

}