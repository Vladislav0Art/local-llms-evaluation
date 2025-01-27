package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
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

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValueWithInvalidEncoding {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyValueWithInvalidEncoding() throws UnsupportedEncodingException, URISyntaxException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        URI uri = new URI(kv.getKey());
        assert uri.getScheme() == null;
        String expectedScheme = "https";
        Mockito.when(connection.getUrl()).thenReturn(uri.toString());

        // When: call the appendKeyVal method on the url builder with invalid encoding
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        try {
            urlBuilder.appendKeyVal(kv, "invalid");
        } catch (UnsupportedEncodingException e) {

            // Then: verify that an exception was thrown
            Mockito.verifyNoMoreInteractions(urlBuilder);
        }
    }

}