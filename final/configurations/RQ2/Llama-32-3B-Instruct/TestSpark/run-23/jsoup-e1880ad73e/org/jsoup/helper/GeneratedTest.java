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
public class GeneratedTest {

    private MockUrl urlMock() {
        return mock(URL.class);
    }

    @Test
    public void newUrlBuilder_withInputUrl_ConstructsNewUrlBuilder() {
        UrlBuilder expected = new UrlBuilder(urlMock());
        assertEquals(expected, new UrlBuilder(urlMock()));
    }

    @Test
    public void build_WithoutKeyVal_ReturnsInputUrl() throws MalformedURLException {
        URL inputUrl = urlMock();
        when(kv).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }

    @Test
    public void appendKeyVal_addsKeyValueToUrl() throws UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = urlMock();
        URL expectedUrl = urlMock();
        when(kv).thenReturn(new KeyVal("key", "value"));

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);

        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void appendKeyVal_withNullKeyValueThrowsUnsupportedEncodingException() {
        URL inputUrl = urlMock();
        when(kv).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void appendKeyVal_withNullKeyValueValueThrowsUnsupportedEncodingException() {
        URL inputUrl = urlMock();
        when(kv).thenReturn(new KeyVal("key", null));

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void appendKeyVal_withNullKeyValueValueAndEmptyKeyThrowsUnsupportedEncoding() {
        URL inputUrl = urlMock();
        when(kv).thenReturn(new KeyVal("", null));

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
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