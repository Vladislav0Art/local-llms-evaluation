package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
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
public class GeneratedBuildWithEmptyQueryParamsReturnsSameUrl {

    private MockUrl urlMock() {
        return mock(URL.class);
    }

    @Test
    public void buildWithEmptyQueryParamsReturnsSameUrl() {
        URL inputUrl = urlMock();
        when(kv).thenReturn(new KeyVal("key", "value"));

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }
}

class MockUrl extends org.jsoup.Connection.URL {

    private Object value;

    @Override
    public String toString() {
        return null;
    }

    @Override
    public URI toURI() {
        return null;
    }

}