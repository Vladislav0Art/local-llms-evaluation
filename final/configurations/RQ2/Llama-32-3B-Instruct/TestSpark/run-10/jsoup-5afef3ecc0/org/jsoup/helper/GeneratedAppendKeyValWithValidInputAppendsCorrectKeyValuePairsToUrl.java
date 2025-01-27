package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithValidInputAppendsCorrectKeyValuePairsToUrl {

    @Mock
    private Connection connection;

    @Mock
    private String urlEncoder;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValWithValidInputAppendsCorrectKeyValuePairsToUrl() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal[] keyValues = {new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2")};
        for (Connection.KeyVal kv : keyValues) {
            builder.appendKeyVal(kv);
        }
        assertEquals(builder.build().toString(), "http://example.com?key1=value1&key2=value2");
    }

}