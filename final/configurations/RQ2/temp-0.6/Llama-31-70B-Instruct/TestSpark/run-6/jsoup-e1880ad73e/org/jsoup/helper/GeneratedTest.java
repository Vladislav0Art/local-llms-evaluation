package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = Mockito.mock(UrlBuilder.class);
    }

    @Test
    public void testBuild() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://jsoup.org");
        when(urlBuilder.build()).thenReturn(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertNotNull(actualUrl);
        assertEquals(inputUrl, actualUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");
        when(urlBuilder.appendKeyVal(kv)).thenCallRealMethod();
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}