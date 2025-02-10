package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        // key value
        String url = "https://example.com";
        Connection connection = Mockito.mock(Connection.class);
        when(connection.toString()).thenReturn(url);
        HashMap<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com?key=value", urlBuilder.build().toString());
    }

}