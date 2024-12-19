package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;

public class GeneratedAppendKeyVal_AppendsMultipleKeyValueToUrl {

    @Mock
    private URL inputUrl;

    @org.mockito.InjectMocks
    private UrlBuilder urlBuilder;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyVal_AppendsMultipleKeyValueToUrl() {
        Connection.KeyVal kv1 = Connection.KeyVal.builder().key("test1").value("value1").build();
        Connection.KeyVal kv2 = Connection.KeyVal.builder().key("test2").value("value2").build();
        when(inputUrl.toExternalForm()).thenReturn("https://example.com");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertEquals("https://example.com?test1=value1&test2=value2", urlBuilder.build().toExternalForm());
    }

}