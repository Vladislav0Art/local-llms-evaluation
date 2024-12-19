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

public class GeneratedAppendKeyVal_keepsPreviousQuery {

    @Test
    public void appendKeyVal_keepsPreviousQuery() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?query=value&foo=bar"));
        String normUrl = urlBuilder.build().toString();
        assertEquals("?key=encoded%3Akey%26value=encoded%3Avalue&foo=bar", normUrl);
    }

}