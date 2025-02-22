package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedAppendKeyValWithNullKeyVal {

    @Test
    public void appendKeyValWithNullKeyVal() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(null);
            assertEquals(null, urlBuilder.q);
        } catch (MalformedURLException | UnsupportedEncodingException e) {
            // ignore
        }
    }

}