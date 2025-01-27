package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValAppendMultipleTimesTest {

    @Test
    public void appendKeyValAppendMultipleTimesTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertTrue(builder.build().getPath().contains("?key1=value1&key2=value2"));
    }

}