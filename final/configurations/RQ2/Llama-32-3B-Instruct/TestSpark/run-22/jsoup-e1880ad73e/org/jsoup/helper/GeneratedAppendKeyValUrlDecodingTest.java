package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.IDN;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValUrlDecodingTest {

    @Test
    public void appendKeyValUrlDecodingTest() throws UnsupportedEncodingException {
        String urlEncodedValue = URLEncoder.encode("value with spaces", UTF_8);
        Connection.KeyVal kv = new Connection.KeyVal("key", urlEncodedValue);
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(kv);
        assertTrue(builder.build().getPath().contains("?key=value%20with%20spaces"));
    }

}