package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyVal_query_string_without_key {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private Connection connection;

    @Test
    public void appendKeyVal_query_string_without_key() {
        String query = "key1=value1&key2=value2";
        when(kv.key()).thenReturn(null);
        when(kv.value()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.q);
    }

}