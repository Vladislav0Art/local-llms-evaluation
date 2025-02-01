package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.UnsupportedEncodingException;

public class GeneratedAppendKeyValTest {

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

}