package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
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
public class GeneratedAppendKeyValToUrlAppendsQueryValueCorrectly {

    @Mock
    private Connection connection;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void appendKeyValToUrlAppendsQueryValueCorrectly() throws UnsupportedEncodingException {
        String query = "key=value";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(keyVal);
        assertEquals("key=value", normalizeQuery(builder.q.toString()));
    }

}