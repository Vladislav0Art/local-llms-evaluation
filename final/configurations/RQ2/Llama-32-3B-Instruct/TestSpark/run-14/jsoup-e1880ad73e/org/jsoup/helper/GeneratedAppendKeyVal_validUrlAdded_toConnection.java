package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
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
public class GeneratedAppendKeyVal_validUrlAdded_toConnection {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyVal_validUrlAdded_toConnection() throws UnsupportedEncodingException {
        URL url = Mockito.mock(URL.class);
        String key = "key";
        String value = "value";

        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        connection.appendKeyVal(kv);

        Mockito.verify(connection).append(key, URI.create("http://example.com/base"), UTF_8.encode(value));
    }

}