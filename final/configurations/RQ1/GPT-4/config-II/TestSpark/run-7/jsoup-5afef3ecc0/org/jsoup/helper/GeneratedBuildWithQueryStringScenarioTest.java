package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildWithQueryStringScenarioTest {

    @Test
    public void buildWithQueryStringScenarioTest() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("key");
        when(kv.value()).thenReturn("value");

        urlBuilder.appendKeyVal(kv);

        URL result = urlBuilder.build();

        assertNotNull(result);
        assertEquals("http://example.com?%20key=%20value", result.toString());
    }

}