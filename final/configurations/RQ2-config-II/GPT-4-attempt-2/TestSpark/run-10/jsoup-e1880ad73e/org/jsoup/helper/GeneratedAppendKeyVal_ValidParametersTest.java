package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendKeyVal_ValidParametersTest {

    @Test
    public void appendKeyVal_ValidParametersTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        urlBuilder.appendKeyVal(kv);

        URL outputUrl = urlBuilder.build();

        Assert.assertNotNull(outputUrl);
    }

}