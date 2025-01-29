package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_UnsupportedEncoding {

    private String inputUrl = "https://example.com/path?a=1&b=2";

    @Before
    public void setup() {
        // Add any necessary setup here
    }

    @Test
    public void testAppendKeyVal_UnsupportedEncoding() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        String[] kv = {"f", "6"};
        try {
            urlBuilder.appendKeyVal(kv);
            FAIL();
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}