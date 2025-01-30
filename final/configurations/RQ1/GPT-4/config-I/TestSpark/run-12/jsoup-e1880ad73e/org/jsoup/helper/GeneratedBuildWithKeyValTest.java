package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildWithKeyValTest {

    @Test
    public void buildWithKeyValTest() throws Exception {
        URL url = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        KeyVal kv = new KeyVal("key", "val");
        urlBuilder.appendKeyVal(kv);
        URL finalUrl = urlBuilder.build();
        String queryString = finalUrl.getQuery();
        assertEquals("key=val", queryString);
    }

}