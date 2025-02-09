package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValNullTest {

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testURL = new URL("http://www.test.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);

        Assert.assertThrows(NullPointerException.class, () -> {
            urlBuilder.appendKeyVal(null);
        });
    }

}