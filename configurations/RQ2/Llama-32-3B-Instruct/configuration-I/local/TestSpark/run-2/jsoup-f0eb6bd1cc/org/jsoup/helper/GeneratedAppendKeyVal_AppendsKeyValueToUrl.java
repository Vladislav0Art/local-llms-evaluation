package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;

public class GeneratedAppendKeyVal_AppendsKeyValueToUrl {

    @Mock
    private URL inputUrl;

    @org.mockito.InjectMocks
    private UrlBuilder urlBuilder;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyVal_AppendsKeyValueToUrl() {
        Connection.KeyVal kv = Connection.KeyVal.builder().key("test").value("value").build();
        when(inputUrl.toExternalForm()).thenReturn("https://example.com");
        urlBuilder.appendKeyVal(kv);
        assertEquals("https://example.com?test=value", urlBuilder.build().toExternalForm());
    }

}