package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderBuildTest {

    @Test
    public void urlBuilderBuildTest() throws Exception {
        URL inputUrl = new URL("http://google.com/search?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://google.com/search?q=test", resultUrl.toString());
    }

}