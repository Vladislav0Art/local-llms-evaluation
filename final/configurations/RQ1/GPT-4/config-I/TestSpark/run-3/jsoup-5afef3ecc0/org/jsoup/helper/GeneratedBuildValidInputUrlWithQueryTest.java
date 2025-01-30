package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildValidInputUrlWithQueryTest {

    @Test
    public void buildValidInputUrlWithQueryTest() throws Exception {
        URL inputUrl = new URL("https://www.google.com/search?q=unit+test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.google.com/search?q=unit+test", resultUrl.toString());
    }

}