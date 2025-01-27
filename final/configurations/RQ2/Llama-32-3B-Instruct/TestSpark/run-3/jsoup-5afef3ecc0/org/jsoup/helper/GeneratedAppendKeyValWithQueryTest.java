package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedAppendKeyValWithQueryTest {

    @Test
    public void appendKeyValWithQueryTest() throws MalformedURLException, URISyntaxException {
        String url = "http://www.test.com?query";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        urlBuilder.appendKeyVal(kv);
        assertEquals(url + "&key=value", StringUtil.getValue(urlBuilder.build()));
    }

}