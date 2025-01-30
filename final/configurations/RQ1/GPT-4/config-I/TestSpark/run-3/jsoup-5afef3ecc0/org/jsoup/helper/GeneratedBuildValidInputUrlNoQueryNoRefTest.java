package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildValidInputUrlNoQueryNoRefTest {

    @Test
    public void buildValidInputUrlNoQueryNoRefTest() throws Exception {
        URL inputUrl = new URL("https", "www.google.com", "/home");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.google.com/home", resultUrl.toString());
    }

}