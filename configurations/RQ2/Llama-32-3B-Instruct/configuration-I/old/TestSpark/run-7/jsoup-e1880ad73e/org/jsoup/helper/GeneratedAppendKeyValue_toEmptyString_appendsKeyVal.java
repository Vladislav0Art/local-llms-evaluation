package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedAppendKeyValue_toEmptyString_appendsKeyVal {

    @Mock
    private URL inputUrl;

    @org.junit.Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValue_toEmptyString_appendsKeyVal() {
        String inputStr = "";
        Connection.KeyVal kv = new Connection.KeyVal("key", "val");
        when(inputUrl.toString()).thenReturn(inputStr);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        assertNotNull(urlBuilder.build().toString());
        assertTrue(urlBuilder.build().toString().contains(kv.getKey()));
    }

}