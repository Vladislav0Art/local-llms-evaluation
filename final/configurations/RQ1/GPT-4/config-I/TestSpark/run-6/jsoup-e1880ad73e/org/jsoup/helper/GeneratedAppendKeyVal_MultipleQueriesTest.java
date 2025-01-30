package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedAppendKeyVal_MultipleQueriesTest {

    @Test
    public void appendKeyVal_MultipleQueriesTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv1 = Connection.KeyVal.create("name", "John");
        urlBuilder.appendKeyVal(kv1);
        Connection.KeyVal kv2 = Connection.KeyVal.create("age", "25");
        urlBuilder.appendKeyVal(kv2);
        assertEquals("?name=John&age=25", urlBuilder.q.toString());
    }

}