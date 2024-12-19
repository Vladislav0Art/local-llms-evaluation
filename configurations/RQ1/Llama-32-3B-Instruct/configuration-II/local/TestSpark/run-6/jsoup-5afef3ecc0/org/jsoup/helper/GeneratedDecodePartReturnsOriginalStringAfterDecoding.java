package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePartReturnsOriginalStringAfterDecoding {

    @Mock
    private Connection connection;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void decodePartReturnsOriginalStringAfterDecoding() {
        String encoded = "http%3A%2F%2Fexample.com";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals(encoded, decoded);
    }

}