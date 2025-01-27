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
public class GeneratedAppendKeyValueWithEncoding {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyValueWithEncoding() throws UnsupportedEncodingException {
        // Given: mock the input key-value pair and specify encoding
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // When: call the appendKeyVal method on the url builder with encoding
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        urlBuilder.appendKeyVal(kv, DataUtil.UTF_8);

        // Then: verify that no exception is thrown
        Mockito.verifyNoInteractions(urlBuilder);
    }

}