package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildValidInputUrlWithRefTest {

    @Test
    public void buildValidInputUrlWithRefTest() throws Exception {
        URL inputUrl = new URL("https://www.google.com/tutorial#step1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://www.google.com/tutorial#step1", resultUrl.toString());
    }

}