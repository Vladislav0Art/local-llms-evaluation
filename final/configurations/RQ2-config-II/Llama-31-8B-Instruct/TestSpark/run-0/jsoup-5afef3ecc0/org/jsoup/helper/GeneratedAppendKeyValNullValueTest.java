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
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValNullValueTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValNullValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}