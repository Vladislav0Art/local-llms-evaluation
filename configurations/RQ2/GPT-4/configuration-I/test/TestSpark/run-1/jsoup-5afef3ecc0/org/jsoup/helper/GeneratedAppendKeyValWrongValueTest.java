package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWrongValueTest {

    @Test
    public void appendKeyValWrongValueTest() throws Exception {
        URL url = new URL("http://www.someurl.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal kv = new Connection.KeyVal("name", "\\uD800");

        urlBuilder.appendKeyVal(kv);
    }

}