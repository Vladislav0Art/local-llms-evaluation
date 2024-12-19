package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

public class GeneratedDecodePart {

    @Test
    public void decodePart() {
        String input = "äöü";
        assertEquals("äöü", UrlBuilder.decodePart(input));
    }

}