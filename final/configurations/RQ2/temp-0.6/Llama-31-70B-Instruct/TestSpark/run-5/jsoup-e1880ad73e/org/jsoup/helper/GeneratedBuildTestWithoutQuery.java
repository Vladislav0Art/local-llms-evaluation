package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTestWithoutQuery {

    @Test
    public void buildTestWithoutQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));
        assertEquals(new URL("http://example.com/"), builder.build());
    }

}