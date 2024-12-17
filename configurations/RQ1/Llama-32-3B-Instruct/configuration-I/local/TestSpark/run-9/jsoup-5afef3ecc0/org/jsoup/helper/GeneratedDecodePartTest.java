package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() {
        String encoded = "%20";
        assertEquals(encoded, UrlBuilder.decodePart(encoded));
    }

}