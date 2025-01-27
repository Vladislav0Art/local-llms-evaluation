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
public class GeneratedAppendKeyVal_withNullValue_throwsUnsupportedEncodingException {

    @Mock
    private Connection connection;

    @Mock
    private String url;

    public UrlBuilderTest() {
    }

    @Test
    public void appendKeyVal_withNullValue_throwsUnsupportedEncodingException() {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(url).appendKeyVal(kv));
    }

}