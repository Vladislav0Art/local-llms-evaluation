package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedBuildMethodAppendsQueryParamsCorrectly {

    @Test
    public void buildMethodAppendsQueryParamsCorrectly() throws URISyntaxException {
        URL originalUrl = new URL("http://example.com");
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(originalUrl);
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        URL result = urlBuilder.build();
        URI uri = result.getURI();
        Map<String, String> queryParams = parseQueryParams(uri.getQuery());
        assertEquals(2, queryParams.size());
        assertTrue(queryParams.containsKey("key1"));
        assertTrue(queryParams.containsKey("key2"));
    }

}