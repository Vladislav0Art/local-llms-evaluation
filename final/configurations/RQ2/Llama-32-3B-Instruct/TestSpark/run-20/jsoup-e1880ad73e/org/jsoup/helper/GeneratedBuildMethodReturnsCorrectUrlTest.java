package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedBuildMethodReturnsCorrectUrlTest {

    @Test
    public void buildMethodReturnsCorrectUrlTest() throws URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URI expectedUri = new URI("http", "localhost", "8080", "/", null, null);
        assertEquals(expectedUri, builder.build());
    }

}