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
public class GeneratedAppendKeyValWithoutValidConnectionResultInUnsupportedEncodingException {

    @Mock
    private Connection connection;

    @Mock
    private String urlEncoder;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValWithoutValidConnectionResultInUnsupportedEncodingException() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new Connection.KeyVal(null)));
    }

}