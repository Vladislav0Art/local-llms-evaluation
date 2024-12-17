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
public class GeneratedBuildUrlWithKeyAndValue {

    @Mock
    private Connection.KeyVal kv;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrlWithKeyAndValue() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal(map);
        builder.appendKeyVal(keyVal);
        URL url = builder.build();
        Mockito.verifyNoInteractions(url);
    }

}