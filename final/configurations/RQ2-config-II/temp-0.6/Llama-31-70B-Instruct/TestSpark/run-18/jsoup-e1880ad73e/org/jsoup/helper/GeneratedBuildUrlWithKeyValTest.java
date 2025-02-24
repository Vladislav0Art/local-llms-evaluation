package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBuildUrlWithKeyValTest {

    @Test
    public void buildUrlWithKeyValTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://www.example.com?key=value", actualUrl.toString());
    }

}