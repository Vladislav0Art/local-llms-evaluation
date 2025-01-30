package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildTestQueryNoRef {

    @Test
    public void buildTestQueryNoRef() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com?test=query");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
        assertEquals("http://www.google.com?test=query", result.toString());
    }

}