package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyVal_withValidKeyVal_appendsKeyValToUrl {

    private static final String ENCODED_URL = "http://example.com/path?key=value";

    @Test
    public void appendKeyVal_withValidKeyVal_appendsKeyValToUrl() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("newKey", "newValue");

        urlBuilder.appendKeyVal(kv);

        URL actualUrl = urlBuilder.build();
        assertEquals("http://example.com/path?key=value&newKey=newValue", actualUrl.toString());
    }

}