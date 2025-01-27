package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValAppendTest {

    @Test
    public void appendKeyValAppendTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().getPath().contains("?key=value"));
    }

}