package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyVal_appendsEncodedKeyValuePairs {

    @Test
    public void appendKeyVal_appendsEncodedKeyValuePairs() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?query=value"));
        String normUrl = urlBuilder.build().toString();
        assertEquals("?key=encoded%3Akey%26value=encoded%3Avalue", normUrl);
    }

}