package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class Generated[UrlBuilder_appendKeyVal_with_multiple_queries]

Test {

    @Test
    public void [UrlBuilder_appendKeyVal_with_multiple_queries]Test() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal keyVal1 = Connection.KeyVal.newKeyVal("key1", "value1");
        Connection.KeyVal keyVal2 = Connection.KeyVal.newKeyVal("key2", "value2");
        builder.appendKeyVal(keyVal1);
        builder.appendKeyVal(keyVal2);
        assertEquals("key1=value1&key2=value2", builder.getQ().toString());
    }

}