package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.util.DataUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

public class GeneratedBuilderBuildUrlTest {

    @Test
    public void builderBuildUrlTest() throws URISyntaxException, MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URI uri = builder.build().toURI();
        assertEquals("http://example.com", uri.toString());
    }

}