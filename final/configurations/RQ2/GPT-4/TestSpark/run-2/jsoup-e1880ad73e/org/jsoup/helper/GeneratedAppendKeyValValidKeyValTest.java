package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValValidKeyValTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void AppendKeyValValidKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.data("key", "value");

        urlBuilder.appendKeyVal(kv);

        assertEquals("http://example.com?key=value", urlBuilder.build());
    }

}