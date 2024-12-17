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
public class GeneratedBuild_[UrlWithQueryAndFragment_]

Test {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private URL inputUrl;

    @Test
    public void build_[ UrlWithQueryAndFragment_]Test() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("key", "value");
        urlBuilder.appendKeyVal(queryMap);
        urlBuilder.appendKeyVal(new Connection.KeyVal(Connection.KeyVal.PAGE, "1"));
        URL result = urlBuilder.build();
        assertEquals(inputUrl.getProtocol(), result.getProtocol());
        assertEquals(inputUrl.getHost(), result.getHost());
    }

}