package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedAppendKeyValue_toInvalidUrl_doesNotAppend {

    @Mock
    private URL inputUrl;

    @org.junit.Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValue_toInvalidUrl_doesNotAppend() {
        String inputStr = "";
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");
        when(inputUrl.toString()).thenReturn(inputStr);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNull(urlBuilder.appendKeyVal(kv));
    }

}