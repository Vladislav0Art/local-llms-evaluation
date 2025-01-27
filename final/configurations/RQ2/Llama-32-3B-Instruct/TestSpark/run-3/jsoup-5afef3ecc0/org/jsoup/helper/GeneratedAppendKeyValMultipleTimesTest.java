package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedAppendKeyValMultipleTimesTest {

    @Test
    public void appendKeyValMultipleTimesTest() throws MalformedURLException, URISyntaxException {
        String url = "http://www.test.com";
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertEquals(url + "&key1=value1&key2=value2", StringUtil.getValue(urlBuilder.build()));
    }

}