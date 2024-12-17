package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTestUrlBuilderWithQuery {

    @Test
    public void testUrlBuilderWithQuery() throws MalformedURLException {
        String PROTOCOL = "http";
        String PATH = "/api/endpoint";
        String QUERY = "?param=value";

        UrlBuilder builder = new UrlBuilder(PROTOCOL, PATH);
        builder.appendQuery(QUERY);
        assertEquals(PROTOCOL + PATH + "?" + QUERY, builder.toString());
    }

}