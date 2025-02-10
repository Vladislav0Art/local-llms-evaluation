package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlBuilderAppendKeyValWithoutQueryTest {

    @Test
    public void urlBuilderAppendKeyValWithoutQueryTest() throws UnsupportedEncodingException {
        String expectedUrl = "http://example.com?key=value";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(Connection.KeyVal.create(0, "key", "value"));
        assertEquals(expectedUrl, builder.build().toString());
    }

}