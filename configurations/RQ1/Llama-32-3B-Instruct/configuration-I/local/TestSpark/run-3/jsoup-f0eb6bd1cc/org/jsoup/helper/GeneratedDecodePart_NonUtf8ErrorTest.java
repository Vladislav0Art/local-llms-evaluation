package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedDecodePart_NonUtf8ErrorTest {

    @Test
    public void decodePart_NonUtf8ErrorTest() {
        String encoded = "\u2635\u2665\u00a2\u2648";
        assertThrows(UnsupportedEncodingException.class, () -> decodePart(encoded));
    }

}