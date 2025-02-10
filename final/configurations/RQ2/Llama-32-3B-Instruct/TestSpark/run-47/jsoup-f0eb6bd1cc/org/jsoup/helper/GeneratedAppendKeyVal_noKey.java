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

public class GeneratedAppendKeyVal_noKey {

    @Test
    public void appendKeyVal_noKey() throws UnsupportedEncodingException {
        // key value with no key
        String url = "https://example.com";
        Connection connection = Mockito.mock(Connection.class);
        when(connection.toString()).thenReturn(url);
        HashMap<String, String> kv = new HashMap<>();
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        urlBuilder.appendKeyVal(kv);
        assertEquals(url, urlBuilder.build().toString());
    }

}