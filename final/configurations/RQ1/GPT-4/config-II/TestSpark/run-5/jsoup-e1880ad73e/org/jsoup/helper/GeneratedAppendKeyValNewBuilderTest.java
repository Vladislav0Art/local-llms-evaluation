package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedAppendKeyValNewBuilderTest {

    @Test
    public void appendKeyValNewBuilderTest() throws MalformedURLException {
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        URL url = new URL("http://www.google.com?q=something");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.appendKeyVal(kv);
    }

}