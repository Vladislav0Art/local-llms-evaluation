package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildInvalidInputUrlTest {

    @Test
    public void buildInvalidInputUrlTest() throws Exception {
        URL inputUrl = new URL("https://www.invalid__.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.invalid__.com", resultUrl.toString());
    }

}