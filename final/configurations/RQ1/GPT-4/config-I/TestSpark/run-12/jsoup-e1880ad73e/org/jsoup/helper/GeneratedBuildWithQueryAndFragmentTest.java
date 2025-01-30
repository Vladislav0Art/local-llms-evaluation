package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildWithQueryAndFragmentTest {

    @Test
    public void buildWithQueryAndFragmentTest() throws Exception {
        URL url = new URL("https://www.example.com#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL finalUrl = urlBuilder.build();
        assertEquals("key=value", finalUrl.getQuery());
        assertEquals("https://www.example.com?key=value#fragment", finalUrl.toString());
    }

}