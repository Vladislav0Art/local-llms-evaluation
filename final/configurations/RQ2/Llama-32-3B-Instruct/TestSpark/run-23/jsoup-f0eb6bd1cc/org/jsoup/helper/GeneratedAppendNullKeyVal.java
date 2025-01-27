package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendNullKeyVal {

    @Test
    public void appendNullKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        try {
            builder.appendKeyVal(null);
            assert false;
        } catch (UnsupportedEncodingException e) {
        }
    }

}