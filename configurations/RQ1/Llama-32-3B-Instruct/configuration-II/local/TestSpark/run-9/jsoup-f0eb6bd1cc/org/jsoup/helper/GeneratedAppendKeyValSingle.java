package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValSingle {

    @Test
    public void appendKeyValSingle() {
        UrlBuilder builder = new UrlBuilder(null);
        Connection.KeyVal kv = new HashMap<String, String>().entrySet().next();
        String expected = "?key=" + URLEncoder.encode(kv.getKey(), "UTF-8") + "&value=" + URLEncoder.encode(kv.getValue(), "UTF-8");
        assertEquals(expected, builder.appendKeyVal(kv).toString());
    }

}