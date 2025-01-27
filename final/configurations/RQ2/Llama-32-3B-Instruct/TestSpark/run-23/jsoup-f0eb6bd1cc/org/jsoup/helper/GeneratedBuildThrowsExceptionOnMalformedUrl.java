package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedBuildThrowsExceptionOnMalformedUrl {

    @Test
    public void buildThrowsExceptionOnMalformedUrl() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("invalid://example.com"));
        try {
            builder.build();
            assert false;
        } catch (URISyntaxException e) {
        }
    }

}