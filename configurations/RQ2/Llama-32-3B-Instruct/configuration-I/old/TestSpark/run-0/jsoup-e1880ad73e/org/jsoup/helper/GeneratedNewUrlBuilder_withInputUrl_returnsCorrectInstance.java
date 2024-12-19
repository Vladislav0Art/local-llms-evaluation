package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedNewUrlBuilder_withInputUrl_returnsCorrectInstance {

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

}