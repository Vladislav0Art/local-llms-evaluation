package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal testPair = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(testPair);

        URL builtUrl = urlBuilder.build();

        assertTrue(builtUrl.getQuery().contains("key=value"));
    }

}