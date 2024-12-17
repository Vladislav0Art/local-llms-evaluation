package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedBuild_urlWithoutQueryParams_returnsCorrectUri {

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
    public void build_urlWithoutQueryParams_returnsCorrectUri() throws URISyntaxException {
        Mockito.when(inputUrl.toURI()).thenReturn(new URI("https://example.com"));
        URL urlBuilder = new URL("https://example.com");
        UrlBuilder instance = new UrlBuilder(urlBuilder);
        URL uri = instance.build();
        assertEquals(new URI("https://example.com"), uri.toURI());
    }

}