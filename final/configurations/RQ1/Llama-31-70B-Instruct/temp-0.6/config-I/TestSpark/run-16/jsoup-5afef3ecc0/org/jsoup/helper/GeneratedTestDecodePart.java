package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedTestDecodePart {

    @Test
    public void testDecodePart() {
        assertEquals("name=value", UrlBuilder.decodePart("name%3Dvalue"));
    }

}