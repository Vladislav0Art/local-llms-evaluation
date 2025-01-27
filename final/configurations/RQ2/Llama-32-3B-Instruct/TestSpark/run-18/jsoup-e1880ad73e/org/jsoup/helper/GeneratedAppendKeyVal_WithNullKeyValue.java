package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.Connection.KeyVal;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_WithNullKeyValue {

    @Mock
    private Connection connection;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyVal_WithNullKeyValue() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", null);
        when(connection.getKey()).thenReturn(kv.getKey());
        when(connection.getValue()).thenReturn(kv.getValue());

        urlBuilder.appendKeyVal(kv);
        assertNull(StringUtil.getEncodedKvPair(kv.getKey(), kv.getValue()));
    }

}