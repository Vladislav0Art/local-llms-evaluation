package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValMulti {

    @Test
    public void appendKeyValMulti() {
        UrlBuilder builder = new UrlBuilder(null);
        Connection.KeyVal kv1 = new HashMap<String, String>().entrySet().next();
        Connection.KeyVal kv2 = new HashMap<String, String>().entrySet().next();
        String expected = "?key1=" + URLEncoder.encode(kv1.getKey(), "UTF-8") + "&value1=" + URLEncoder.encode(kv1.getValue(), "UTF-8")
                + "&key2=" + URLEncoder.encode(kv2.getKey(), "UTF-8") + "&value2=" + URLEncoder.encode(kv2.getValue(), "UTF-8");
        assertEquals(expected, builder.appendKeyVal(kv1).appendKeyVal(kv2).toString());
    }

}