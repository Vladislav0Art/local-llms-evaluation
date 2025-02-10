package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
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

import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithMultipleQueryParams {

    @Test
    public void buildUrlWithMultipleQueryParams() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal[] kv = new Connection.KeyVal[]{new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        buildUrlWithKeyVal(builder, kv);
    }

    private void buildUrlWithKeyVal(UrlBuilder builder, Connection.KeyVal kv) throws UnsupportedEncodingException {
        when(builder.appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenReturn(null); // mock appendKeyVal to return null
        builder.appendKeyVal(kv);
        assertNotNull(builder.build());
    }

}