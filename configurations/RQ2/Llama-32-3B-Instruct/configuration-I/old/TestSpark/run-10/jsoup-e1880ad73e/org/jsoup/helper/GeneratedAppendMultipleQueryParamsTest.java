package org.jsoup.helper;

import org.jsoup.helper.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendMultipleQueryParamsTest {

    @Test
    public void AppendMultipleQueryParamsTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> queryParams1 = new HashMap<>();
        queryParams1.put("query1", "param1");
        org.jsoup.helper.Connection.KeyVal kv1 = org.jsoup.helper.Connection.KeyVal.create(queryParams1);
        Map<String, String> queryParams2 = new HashMap<>();
        queryParams2.put("query2", "param2");
        org.jsoup.helper.Connection.KeyVal kv2 = org.jsoup.helper.Connection.KeyVal.create(queryParams2);
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertEquals("http://example.com?query1=param1&query2=param2", urlBuilder.build().toString());
    }

}