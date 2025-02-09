package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValInvalidTest {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void AppendKeyValInvalidTest() throws UnsupportedEncodingException {
        URL url = null;

        try {
            url = new URL("http://www.example.com");
        } catch (MalformedURLException e) {
            Assert.fail("Could not construct URL: " + e.getMessage());
        }

        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(null);
    }

}