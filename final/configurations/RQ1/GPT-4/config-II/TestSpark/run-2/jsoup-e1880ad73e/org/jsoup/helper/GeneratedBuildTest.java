package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        assertNotNull(outputUrl);
    }

}