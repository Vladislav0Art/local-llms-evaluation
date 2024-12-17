package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_withInvalidKeyValue_throwsUnsupportedEncodingExeception {

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
    public void appendKeyVal_withInvalidKeyValue_throwsUnsupportedEncodingExeception() {
        Mockito.when(baseUri.getQuery()).thenReturn("");
        Mockito.when(kv.getKey()).thenReturn("key");
        Mockito.when(kv.getValue()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}