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
public class GeneratedAppendBase64 ShallAddToUrl {

    @Mock
    private Connection.KeyVal kv;

    @Spy
    private UrlBuilder urlBuilder;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendBase64

    ShallAddToUrl() {
        // given:
        String base64String = "SGVsbG8gd29ybGQh";
        Map<String, String> data = new HashMap<>();
        data.put("key1", Base64.getDecoder().decode(base64String));
        urlBuilder.keyVals = data;
        Mockito.when(kv.encode()).thenReturn("");

        // when
        urlBuilder.appendKeyVal(kv);

        // then
    }

}