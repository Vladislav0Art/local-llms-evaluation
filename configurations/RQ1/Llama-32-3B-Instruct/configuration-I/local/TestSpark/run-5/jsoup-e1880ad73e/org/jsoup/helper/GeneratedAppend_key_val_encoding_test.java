package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppend_key_val_encoding_test {

    @Test
    public void append_key_val_encoding_test() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder ub = new UrlBuilder(null);
        ub.appendKeyVal(kv);
        assertNotNull(ub.q);
        assertEquals("key=value", ub.q.toString());
    }

}