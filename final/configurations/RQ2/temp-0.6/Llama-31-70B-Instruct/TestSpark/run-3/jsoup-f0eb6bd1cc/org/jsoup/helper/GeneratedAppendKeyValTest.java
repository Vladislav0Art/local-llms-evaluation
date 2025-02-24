package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "val", false);
        urlBuilder.appendKeyVal(kv);
    }

}