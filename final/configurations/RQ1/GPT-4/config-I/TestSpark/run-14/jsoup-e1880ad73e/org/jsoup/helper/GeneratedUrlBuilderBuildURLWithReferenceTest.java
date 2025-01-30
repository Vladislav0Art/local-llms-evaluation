package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderBuildURLWithReferenceTest {

    @Test
    public void urlBuilderBuildURLWithReferenceTest() throws Exception {
        URL inputUrl = new URL("http://google.com/search?q=test#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();

        assertEquals("http://google.com/search?q=test#anchor", resultUrl.toString());
    }

}