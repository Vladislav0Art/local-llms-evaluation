package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?a=1&b=2";
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put("c", "3");
        Connection.KeyVal[] kvArray = {new Connection.KeyVal("d", "4")};
        builder.appendKeyVal(kvArray);
        assertNotNull(builder.q.toString());
    }

}