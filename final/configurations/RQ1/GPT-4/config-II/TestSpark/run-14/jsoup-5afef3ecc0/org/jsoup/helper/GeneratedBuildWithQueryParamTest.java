package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuildWithQueryParamTest {

    @Test
    public void buildWithQueryParamTest() throws Exception {
        URL url = new URL("https://google.com");
        UrlBuilder builder = new UrlBuilder(url);

        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("q");
        Mockito.when(kv.value()).thenReturn("java");

        builder.appendKeyVal(kv);
        URL outputUrl = builder.build();

        assertNotEquals("https://google.com", outputUrl.toString());
    }

}