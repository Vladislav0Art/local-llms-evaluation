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
public class GeneratedBuildUrlWithQuery {

    @Mock
    private Connection.KeyVal kv;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrlWithQuery() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal(map);
        builder.appendKeyVal(keyVal);
        String query = "key1=value1&key2=value2";
        Mockito.when(kv.getKeyValues()).thenReturn(query);
        URL url = builder.build();
        org.junit.Assert.assertTrue(url.toString().contains("?"));
    }

}