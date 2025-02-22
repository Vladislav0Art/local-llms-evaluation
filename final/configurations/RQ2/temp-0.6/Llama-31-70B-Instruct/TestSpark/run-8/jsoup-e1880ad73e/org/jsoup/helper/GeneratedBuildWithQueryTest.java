package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildWithQueryTest {

    @Test
    public void buildWithQueryTest() throws URISyntaxException {
        URL url = new URL("http://www.example.com/test?key=value&key2=value2");
        UrlBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        assertEquals("http://www.example.com/test?key=value&key2=value2", result.toString());
    }

}