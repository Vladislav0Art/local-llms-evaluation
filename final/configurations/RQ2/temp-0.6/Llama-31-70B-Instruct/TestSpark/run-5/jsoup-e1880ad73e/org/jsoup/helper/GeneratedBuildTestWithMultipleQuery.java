package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTestWithMultipleQuery {

    @Test
    public void buildTestWithMultipleQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        builder.appendKeyVal(new KeyVal("q", "jsoup", false));
        builder.appendKeyVal(new KeyVal("lang", "en", false));
        assertEquals(new URL("http://example.com/?q=jsoup&lang=en"), builder.build());
    }

}