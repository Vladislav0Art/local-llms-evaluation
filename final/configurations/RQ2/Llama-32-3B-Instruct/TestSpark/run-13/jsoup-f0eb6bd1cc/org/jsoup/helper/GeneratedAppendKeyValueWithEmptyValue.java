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
public class GeneratedAppendKeyValueWithEmptyValue {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyValueWithEmptyValue() {
        // Given: mock the input key-value pair with an empty value
        Connection.KeyVal kv = new Connection.KeyVal("key", "");

        // When: call the appendKeyVal method on the url builder
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {

            // Then: verify that an exception was thrown
            Mockito.verifyNoMoreInteractions(urlBuilder);
        }
    }

}