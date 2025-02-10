package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValAndGetKeyValWithNullKeyTest {

    @Mock
    private URL inputUrl;

    @Test
    public void appendKeyValAndGetKeyValWithNullKeyTest() throws UnsupportedEncodingException {
        String key = null;
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertNull(kv.getKey());
        assertEquals(value, kv.getValue());
    }

}