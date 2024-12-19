package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal ShallThrowExceptionOnInvalidEncoding {

    @Mock
    private Connection.KeyVal kv;

    @Spy
    private UrlBuilder urlBuilder;

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void appendKeyVal

    ShallThrowExceptionOnInvalidEncoding() {
        // given:
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        urlBuilder.keyVals = data;
        Mockito.when(kv.encode()).thenReturn(null);

        // when and then
        org.junit.Assert.assertThat(() -> urlBuilder.appendKeyVal(), org.hamcrest.CoreMatchers.isExceptionThatThrows(UnsupportedEncodingException.class));
    }

}