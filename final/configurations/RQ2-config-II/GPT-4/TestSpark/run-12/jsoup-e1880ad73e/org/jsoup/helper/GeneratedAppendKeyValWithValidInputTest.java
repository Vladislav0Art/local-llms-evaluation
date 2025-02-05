package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValWithValidInputTest {

    @Test
    public void appendKeyValWithValidInputTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.append.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL urlAfterAppended = urlBuilder.build();
        assertEquals("http://www.append.com?key=value", urlAfterAppended.toString());
    }

}