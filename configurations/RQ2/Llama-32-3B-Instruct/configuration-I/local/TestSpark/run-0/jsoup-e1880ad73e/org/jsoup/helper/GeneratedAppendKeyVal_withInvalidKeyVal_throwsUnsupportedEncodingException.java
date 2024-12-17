package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal_withInvalidKeyVal_throwsUnsupportedEncodingException {

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
    public void appendKeyVal_withInvalidKeyVal_throwsUnsupportedEncodingException() {
        Mockito.when(baseUri.getQuery()).thenReturn("");
        Mockito.when(kv.getKey()).thenReturn(null);
        Mockito.when(kv.getValue()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
    }

}