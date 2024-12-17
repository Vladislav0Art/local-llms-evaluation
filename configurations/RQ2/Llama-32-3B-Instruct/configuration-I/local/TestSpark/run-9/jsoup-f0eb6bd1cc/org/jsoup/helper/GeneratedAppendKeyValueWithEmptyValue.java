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
public class GeneratedAppendKeyValueWithEmptyValue {

    @Mock
    private Connection.KeyVal kv;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValueWithEmptyValue() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Map<String, String> map = new HashMap<>();
        map.put("key", "");
        Connection.KeyVal keyVal = new Connection.KeyVal(map);
        builder.appendKeyVal(keyVal);
        Mockito.verify(builder).appendQueryValues(Mockito.anyString());
    }

}