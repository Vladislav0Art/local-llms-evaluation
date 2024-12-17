package org.jsoup.helper;

import org.jsoup.helper.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendQueryParamTest {

    @Test
    public void AppendQueryParamTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("query", "param");
        org.jsoup.helper.Connection.KeyVal kv = org.jsoup.helper.Connection.KeyVal.create(queryParams);
        urlBuilder.appendKeyVal(kv);
        assertEquals("http://example.com?query=param", urlBuilder.build().toString());
    }

}