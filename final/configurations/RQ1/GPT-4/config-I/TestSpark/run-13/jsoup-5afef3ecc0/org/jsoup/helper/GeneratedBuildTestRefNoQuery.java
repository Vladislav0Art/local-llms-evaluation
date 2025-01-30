package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuildTestRefNoQuery {

    @Test
    public void buildTestRefNoQuery() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com#test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL result = urlBuilder.build();
        assertEquals("http://www.google.com#test", result.toString());
    }

}