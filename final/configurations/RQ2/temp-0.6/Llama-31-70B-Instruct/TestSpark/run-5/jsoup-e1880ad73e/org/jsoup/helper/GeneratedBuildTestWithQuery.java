package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTestWithQuery {

    @Test
    public void buildTestWithQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        builder.appendKeyVal(new KeyVal("q", "jsoup", false));
        assertEquals(new URL("http://example.com/?q=jsoup"), builder.build());
    }

}