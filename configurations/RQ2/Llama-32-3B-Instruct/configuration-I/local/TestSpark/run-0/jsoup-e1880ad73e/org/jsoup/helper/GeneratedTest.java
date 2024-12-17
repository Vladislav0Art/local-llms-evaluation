package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Mock
    private URI baseUri;

    @Mock
    private Connection.KeyVal kv;

    public void setBaseUri(URI baseUri) {
        this.baseUri = baseUri;
    }

    public void setInputUrl(URL inputUrl) {
        this.inputUrl = inputUrl;
    }

    public void setKeyValue(Connection.KeyVal kv) {
        this.kv = kv;
    }

    @Test
    public void newUrlBuilder_withInputUrl_returnsCorrectInstance() {
        URL urlBuilder = new URL("https://example.com");
        UrlBuilder instance = new UrlBuilder(urlBuilder);
        assertEquals(urlBuilder, instance.getInputUrl());
    }

    @Test
    public void build_urlWithoutQueryParams_returnsCorrectUri() throws URISyntaxException {
        Mockito.when(inputUrl.toURI()).thenReturn(new URI("https://example.com"));
        URL urlBuilder = new URL("https://example.com");
        UrlBuilder instance = new UrlBuilder(urlBuilder);
        URL uri = instance.build();
        assertEquals(new URI("https://example.com"), uri.toURI());
    }

    @Test
    public void build_urlWithQueryParams_returnsCorrectUri() throws URISyntaxException {
        Mockito.when(inputUrl.toURI()).thenReturn(new URI("https://example.com?param1=value1"));
        URL urlBuilder = new URL("https://example.com");
        UrlBuilder instance = new UrlBuilder(urlBuilder);
        URL uri = instance.build();
        assertEquals(new URI("https://example.com?param1=value1"), uri.toURI());
    }

    @Test
    public void build_urlWithFragment_returnsCorrectUri() throws URISyntaxException {
        Mockito.when(inputUrl.toURI()).thenReturn(new URI("https://example.com#fragment"));
        URL urlBuilder = new URL("https://example.com");
        UrlBuilder instance = new UrlBuilder(urlBuilder);
        URL uri = instance.build();
        assertEquals(new URI("https://example.com#fragment"), uri.toURI());
    }

    @Test
    public void appendKeyVal_withValidKeyVal_addsCorrectQueryParams() {
        Mockito.when(baseUri.getQuery()).thenReturn("");
        Mockito.when(kv.getKey()).thenReturn("key");
        Mockito.when(kv.getValue()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", baseUri.getQuery());
    }

    @Test
    public void appendKeyVal_withInvalidKeyVal_throwsUnsupportedEncodingException() {
        Mockito.when(baseUri.getQuery()).thenReturn("");
        Mockito.when(kv.getKey()).thenReturn(null);
        Mockito.when(kv.getValue()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

    @Test
    public void appendKeyVal_withInvalidKeyValue_throwsUnsupportedEncodingExeception() {
        Mockito.when(baseUri.getQuery()).thenReturn("");
        Mockito.when(kv.getKey()).thenReturn("key");
        Mockito.when(kv.getValue()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}