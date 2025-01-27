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

public class GeneratedAppendKeyVal_thenBuild_doesNotAppendQuery {

    @Test
    public void appendKeyVal_thenBuild_doesNotAppendQuery() {
        String original = "https://example.com";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = UrlBuilder.fromValidUrl(original);
        assertNotNull(builder.appendKeyVal(kv).build());
        assertEquals(original, builder.appendKeyVal(kv).build());
    }

}