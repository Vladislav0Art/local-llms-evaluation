package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedAppendKeyValNullInputTest {

    @Test
    public void appendKeyValNullInputTest() throws UnsupportedEncodingException {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost"));
            urlBuilder.appendKeyVal(null);
        } catch (MalformedURLException e) {
            Assert.fail("Null Input for appendKeyVal test failed");
        }
    }

}