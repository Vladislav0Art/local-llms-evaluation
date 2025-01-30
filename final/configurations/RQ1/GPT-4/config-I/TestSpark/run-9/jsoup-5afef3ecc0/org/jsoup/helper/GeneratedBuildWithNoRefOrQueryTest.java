package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedBuildWithNoRefOrQueryTest {

    @Test
    public void buildWithNoRefOrQueryTest() throws Exception {
        URL inputUrl = new URL("http://localhost/test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("Should return normalized URL", new URL("http://localhost/test"), urlBuilder.build());
    }

}