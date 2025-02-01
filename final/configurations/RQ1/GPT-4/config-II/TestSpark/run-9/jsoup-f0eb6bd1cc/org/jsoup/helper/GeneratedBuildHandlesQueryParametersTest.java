package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedBuildHandlesQueryParametersTest {

    @Test
    public void buildHandlesQueryParametersTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?a=b"));

        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("c");
        Mockito.when(kv.value()).thenReturn("d");

        urlBuilder.appendKeyVal(kv);

        URL result = urlBuilder.build();

        Assert.assertTrue(result.toString().endsWith("?a=b&c=d"));
    }

}