package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedDecodePart_UnicodeEncodingErrorTest {

    @Test
    public void decodePart_UnicodeEncodingErrorTest() throws MalformedURLException, URISyntaxException {
        String encoded = "\u2635\u2665\u00a0\u2648";
        assertEquals("a#-b", decodePart(encoded));
    }

}