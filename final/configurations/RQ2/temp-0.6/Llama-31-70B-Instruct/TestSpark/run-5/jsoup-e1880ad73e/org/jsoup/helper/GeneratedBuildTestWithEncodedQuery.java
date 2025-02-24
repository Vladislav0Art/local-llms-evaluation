package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTestWithEncodedQuery {

    @Test
    public void buildTestWithEncodedQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        builder.appendKeyVal(new KeyVal("q", "jsoup", false));
        builder.appendKeyVal(new KeyVal("lang", "en", false));
        builder.appendKeyVal(new KeyVal("msg", "hello world", false));
        assertEquals(new URL("http://example.com/?q=jsoup&lang=en&msg=hello+world"), builder.build());
    }

}