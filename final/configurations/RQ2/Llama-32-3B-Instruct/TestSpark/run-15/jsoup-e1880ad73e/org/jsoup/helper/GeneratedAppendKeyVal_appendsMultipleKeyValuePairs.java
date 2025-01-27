package org.jsoup.helper;

import org.jsoup.Connection;
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

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyVal_appendsMultipleKeyValuePairs {

    @Test
    public void appendKeyVal_appendsMultipleKeyValuePairs() {
        String original = "path/to/resource";
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv1));
        assertNotNull(builder.appendKeyVal(kv2));
        assertEquals(original + "?key1=value1&key2=value2", builder.appendKeyVal(kv1).appendKeyVal(kv2).get());
    }

}