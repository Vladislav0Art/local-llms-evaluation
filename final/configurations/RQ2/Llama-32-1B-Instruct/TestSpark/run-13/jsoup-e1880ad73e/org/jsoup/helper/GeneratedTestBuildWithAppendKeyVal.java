package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

import static org.junit.Assert.*;

public class GeneratedTestBuildWithAppendKeyVal {

    private String inputUrl = "https://example.com/path?a=1&b=2";

    @Before
    public void setup() {
        // Add any necessary setup here
    }

    @Test
    public void testBuildWithAppendKeyVal() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        urlBuilder.appendKeyVal(new org.jsoup.helper.KeyVal("c", "3"));
        String result = urlBuilder.build();
        assertEquals("https://example.com/path?a=1&b=2&c=3", result);
    }

}