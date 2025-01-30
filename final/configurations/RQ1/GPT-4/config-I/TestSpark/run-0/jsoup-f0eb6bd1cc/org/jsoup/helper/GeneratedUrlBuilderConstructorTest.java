package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.Objects;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/?query=myQuery"));
        assertNotNull(urlBuilder);
        assertTrue(urlBuilder.q.toString().contains("query=myQuery"));
    }

}