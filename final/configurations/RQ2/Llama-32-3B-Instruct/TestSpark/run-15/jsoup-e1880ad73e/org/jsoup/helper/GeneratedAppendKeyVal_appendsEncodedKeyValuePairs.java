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

public class GeneratedAppendKeyVal_appendsEncodedKeyValuePairs {

    @Test
    public void appendKeyVal_appendsEncodedKeyValuePairs() {
        String original = "path/to/resource";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv));
        assertEquals(original + "?key=" + URLEncoder.encode("value", DataUtil.UTF_8), builder.appendKeyVal(kv).get());
    }

}