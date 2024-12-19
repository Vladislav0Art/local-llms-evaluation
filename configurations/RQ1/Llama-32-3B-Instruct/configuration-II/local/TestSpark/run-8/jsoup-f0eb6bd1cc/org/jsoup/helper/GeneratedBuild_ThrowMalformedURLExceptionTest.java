package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedBuild_ThrowMalformedURLExceptionTest {

    @Test
    public void build_ThrowMalformedURLExceptionTest() {
        try {
            UrlBuilder.builder(new URL("invalid://url"));
            assert false;
            assert true; // should never reach here
        } catch (MalformedURLException e) {
            // Test that the correct exception is thrown
        }
    }

}