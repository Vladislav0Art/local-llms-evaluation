package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_MultipleValues {

    private String inputUrl = "https://example.com/path?a=1&b=2";

    @Before
    public void setup() {
        // Add any necessary setup here
    }

    @Test
    public void testAppendKeyVal_MultipleValues() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        urlBuilder.appendKeyVal(new org.jsoup.helper.KeyVal("e", "5"));
        String result = urlBuilder.build();
        assertEquals("https://example.com/path?a=1&b=2&c=3&e=5", result);
    }

}