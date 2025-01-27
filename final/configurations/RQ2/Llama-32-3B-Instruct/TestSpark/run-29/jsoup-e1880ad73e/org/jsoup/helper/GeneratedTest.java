package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection connection;

    @Mock
    private String url;

    public UrlBuilderTest() {
    }

    @Test
    public void newUrlBuilder_withNullUrl_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void build_url() {
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals(url, result.toString());
    }

    @Test
    public void appendKeyVal_withValidKeyAndValue_appendsToUrl() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        String expectedUrl = url + "?" + StringUtil.encode(kv.getKey(), UTF_8) + "=" + StringUtil.encode(kv.getValue(), UTF_8);
        urlBuilder.appendKeyVal(kv);
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal_withNullValue_throwsUnsupportedEncodingException() {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(url).appendKeyVal(kv));
    }

}