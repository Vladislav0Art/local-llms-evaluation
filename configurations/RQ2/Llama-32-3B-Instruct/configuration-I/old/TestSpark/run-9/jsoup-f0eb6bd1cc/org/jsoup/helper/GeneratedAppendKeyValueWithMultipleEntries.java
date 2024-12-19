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
public class GeneratedAppendKeyValueWithMultipleEntries {

    @Mock
    private Connection.KeyVal kv;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValueWithMultipleEntries() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Connection.KeyVal keyVal = new Connection.KeyVal(map);
        Mockito.when(keyVal.getKeyValues()).thenReturn("key1=value1&key2=value2");
        builder.appendKeyVal(keyVal);
        Mockito.verify(builder).appendQueryValues(Mockito.anyString());
    }

}