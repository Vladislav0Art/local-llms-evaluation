package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest_ConstructedWithValidUrl_ReturnsSameUrl() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com");
        URL result = urlBuilder.build();
        assertEquals(inputUrl, result);
    }

    @Test
    public void buildUrlTest_ConstructedWithNullUrl_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void appendKeyValTest_AppendingValidKeyVal_AppendsCorrectly() throws UnsupportedEncodingException {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.build().getQuery());
    }

    @Test
    public void appendKeyValTest_AppendingNullKeyVal_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void appendKeyValTest_AppendingKeyValWithNullKey_ThrowsNullPointerException() {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn((String) null);
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(kv));
    }

    @Test
    public void appendKeyValTest_AppendingKeyValWithNullValue_ThrowsNullPointerException() {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.getValue()).thenReturn((String) null);
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}