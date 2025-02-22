package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        URL url = new URL("http://example.com:8080/path/to/file?key=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("http://xn--example-hva.com:8080/path/to/file?key=value#anchor", urlBuilder.build().toString());
    }

}