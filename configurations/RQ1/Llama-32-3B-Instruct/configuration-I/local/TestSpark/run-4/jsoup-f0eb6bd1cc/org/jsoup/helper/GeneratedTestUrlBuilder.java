package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() throws MalformedURLException {
        String PROTOCOL = "http";
        String PATH = "/api/endpoint";

        UrlBuilder builder = new UrlBuilder(PROTOCOL, PATH);
        assertEquals(PROTOCOL + PATH, builder.toString());
    }

}