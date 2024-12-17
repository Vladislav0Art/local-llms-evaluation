package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_appendKeyVal]

Test {

    @Test
    public void [UrlBuilder_appendKeyVal]Test() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal keyVal = Connection.KeyVal.newKeyVal("key", "value");
        builder.appendKeyVal(keyVal);
        assertEquals("key=value", builder.getQ().toString());
    }

}