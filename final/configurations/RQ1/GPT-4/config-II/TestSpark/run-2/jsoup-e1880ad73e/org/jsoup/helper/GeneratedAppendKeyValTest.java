package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyValue = new Connection.KeyVal("search", "jsoup");
        builder.appendKeyVal(keyValue);
        URL outputUrl = builder.build();
        assertTrue(outputUrl.getQuery().contains("search=jsoup"));
    }

}