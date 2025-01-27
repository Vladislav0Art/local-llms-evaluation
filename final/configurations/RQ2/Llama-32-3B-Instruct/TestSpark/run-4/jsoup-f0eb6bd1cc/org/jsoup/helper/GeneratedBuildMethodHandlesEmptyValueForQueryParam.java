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

public class GeneratedBuildMethodHandlesEmptyValueForQueryParam {

    @Test
    public void buildMethodHandlesEmptyValueForQueryParam() throws URISyntaxException {
        URL originalUrl = new URL("http://example.com");
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "");
        UrlBuilder urlBuilder = new UrlBuilder(originalUrl);
        urlBuilder.appendKeyVal(kv1);
        URL result = urlBuilder.build();
        URI uri = result.getURI();
        Map<String, String> queryParams = parseQueryParams(uri.getQuery());
        assertEquals(1, queryParams.size());
        assertTrue(queryParams.containsKey("key1"));
    }

    private Map<String, String> parseQueryParams(String query) {
        HashMap<String, String> params = new HashMap<>();
        if (query != null && !query.isEmpty()) {
            Pattern pattern = Pattern.compile("([^=]+)=(.*)");
            Matcher matcher = pattern.matcher(query);
            while (matcher.find()) {
                params.put(matcher.group(1), matcher.group(2));
            }
        }
        return params;
    }

}