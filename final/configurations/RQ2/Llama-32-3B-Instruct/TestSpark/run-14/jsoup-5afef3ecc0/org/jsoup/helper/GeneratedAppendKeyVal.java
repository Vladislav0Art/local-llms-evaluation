package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private String query;

    @Mock
    private URL url;

    public void setup() {
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");
        when(url.toURI()).thenReturn(new URI("/url"));
    }

    @Test
    public void appendKeyVal() {
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(kv);

        assertEquals("?key=value", url.toURI().getQuery());
    }

}