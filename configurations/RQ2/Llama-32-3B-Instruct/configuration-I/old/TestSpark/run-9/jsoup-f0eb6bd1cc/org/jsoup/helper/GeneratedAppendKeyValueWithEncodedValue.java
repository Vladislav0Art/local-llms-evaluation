package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValueWithEncodedValue {

    @Mock
    private Connection.KeyVal kv;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValueWithEncodedValue() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Connection.KeyVal keyVal = new Connection.KeyVal(map);
        Mockito.when(keyVal.getKeyValues()).thenReturn("key=value");
        builder.appendKeyVal(keyVal);
        Mockito.verify(builder).appendQueryValues("key=%3Dvalue");
    }

}