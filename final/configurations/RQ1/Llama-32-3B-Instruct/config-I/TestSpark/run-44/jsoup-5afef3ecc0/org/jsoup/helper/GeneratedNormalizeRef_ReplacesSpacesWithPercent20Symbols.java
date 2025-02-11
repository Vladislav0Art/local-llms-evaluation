package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedNormalizeRef_ReplacesSpacesWithPercent20Symbols {

    @Test
    public void normalizeRef_ReplacesSpacesWithPercent20Symbols() {
        String r = "Hello World";
        String normalizedR = UrlBuilder.normalizeRef(r);
        assertEquals("Hello%20World", normalizedR);
    }

}