package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyVal_withNonEmptyConnectionAddsQueryParameter {

    @Test
    public void appendKeyVal_withNonEmptyConnectionAddsQueryParameter() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertTrue(builder.q.toString().contains("?"));
    }

}