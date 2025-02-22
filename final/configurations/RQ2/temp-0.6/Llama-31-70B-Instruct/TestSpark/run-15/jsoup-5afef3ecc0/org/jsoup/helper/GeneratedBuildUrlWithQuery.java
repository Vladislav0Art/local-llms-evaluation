package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() throws Exception {
        URL inputUrl = new URL("http://example.com/test?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://example.com/test?key=value", outputUrl.toString());
    }

}