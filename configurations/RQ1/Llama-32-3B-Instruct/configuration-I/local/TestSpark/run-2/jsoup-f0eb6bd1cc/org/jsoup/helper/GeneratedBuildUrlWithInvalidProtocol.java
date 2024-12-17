package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.jsoup.Connection.KeyVal;

public class GeneratedBuildUrlWithInvalidProtocol {

    @Test
    public void buildUrlWithInvalidProtocol() throws Exception {
        String expectedError = "Invalid protocol: https";
        try {
            UrlBuilder builder = new UrlBuilder(new URL("invalid.protocol://example.com/path"));
            fail(expectedError);
        } catch (MalformedURLException e) {
            assertEquals(expectedError, e.getMessage());
        }
    }

}