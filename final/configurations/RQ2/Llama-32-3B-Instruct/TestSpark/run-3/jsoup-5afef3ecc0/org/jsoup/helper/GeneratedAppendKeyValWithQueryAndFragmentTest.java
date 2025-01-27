package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedAppendKeyValWithQueryAndFragmentTest {

    @Test
    public void appendKeyValWithQueryAndFragmentTest() throws MalformedURLException, URISyntaxException {
        String url = "http://www.test.com?query#fragment";
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        urlBuilder.appendKeyVal(kv);
        assertEquals(url + "&key=value#fragment", StringUtil.getValue(urlBuilder.build()));
    }

}