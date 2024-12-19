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
public class GeneratedBuildUrlWithFragment {

    @Mock
    private Connection.KeyVal kv;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrlWithFragment() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com#fragment"));
        Connection.KeyVal keyVal = new Connection.KeyVal(map);
        builder.appendKeyVal(keyVal);
        String fragment = "fragment";
        Mockito.when(kv.getKeyValues()).thenReturn("#" + fragment);
        URL url = builder.build();
        org.junit.Assert.assertTrue(url.toString().endsWith(fragment));
    }

}