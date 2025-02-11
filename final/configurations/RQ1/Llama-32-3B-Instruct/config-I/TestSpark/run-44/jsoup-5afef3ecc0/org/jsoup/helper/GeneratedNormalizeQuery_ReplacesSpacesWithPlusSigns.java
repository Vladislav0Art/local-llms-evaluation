package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedNormalizeQuery_ReplacesSpacesWithPlusSigns {

    @Test
    public void normalizeQuery_ReplacesSpacesWithPlusSigns() {
        String q = "Hello World";
        String normalizedQ = UrlBuilder.normalizeQuery(q);
        assertEquals("Hello+World", normalizedQ);
    }

}