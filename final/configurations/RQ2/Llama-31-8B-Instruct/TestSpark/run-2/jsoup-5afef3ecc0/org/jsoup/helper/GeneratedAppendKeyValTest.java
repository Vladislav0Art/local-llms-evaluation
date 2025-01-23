package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verifyNoMoreInteractions;

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
public class GeneratedAppendKeyValTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal("key", "value");
        urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv);
        verify(urlBuilder, times(1)).appendKeyVal(kv);
    }

}