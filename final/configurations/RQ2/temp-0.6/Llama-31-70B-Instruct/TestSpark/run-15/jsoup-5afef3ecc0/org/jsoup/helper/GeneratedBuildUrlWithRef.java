package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildUrlWithRef {

    @Test
    public void buildUrlWithRef() throws Exception {
        URL inputUrl = new URL("http://example.com/test#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://example.com/test#ref", outputUrl.toString());
    }

}