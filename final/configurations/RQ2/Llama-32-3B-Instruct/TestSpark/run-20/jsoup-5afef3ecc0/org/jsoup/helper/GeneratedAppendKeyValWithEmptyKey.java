package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValWithEmptyKey {

    @Mock
    private Connection connection;

    @Mock
    private URI uri;

    public static final String UTF_8 = "UTF-8";

    @Test
    public void appendKeyValWithEmptyKey() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(connection.getBaseUri());
        builder.appendKeyVal(Connection.KeyVal.newKeyVal("", "value"));
        Mockito.verifyNoMoreInteractions(builder);
    }

}