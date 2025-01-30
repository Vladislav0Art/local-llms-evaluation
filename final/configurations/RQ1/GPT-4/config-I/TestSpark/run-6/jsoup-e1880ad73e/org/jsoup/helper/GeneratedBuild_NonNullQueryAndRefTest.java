package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuild_NonNullQueryAndRefTest {

    @Test
    public void build_NonNullQueryAndRefTest() throws MalformedURLException {
        URL inputUrl = new URL("http://google.com?query=value#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotEquals(inputUrl, outputUrl);
    }

}