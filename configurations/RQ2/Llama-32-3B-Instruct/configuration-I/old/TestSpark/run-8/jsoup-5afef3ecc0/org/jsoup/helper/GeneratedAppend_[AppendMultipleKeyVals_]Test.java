package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppend_[AppendMultipleKeyVals_]

Test {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private URL inputUrl;

    @Test
    public void append_[ AppendMultipleKeyVals_]Test() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> queryMap1 = new HashMap<>();
        queryMap1.put("key", "value");
        Map<String, String> queryMap2 = new HashMap<>();
        queryMap2.put("key2", "value2");
        urlBuilder.appendKeyVal(queryMap1);
        urlBuilder.appendKeyVal(queryMap2);
        assertNotNull(urlBuilder.build());
    }

}