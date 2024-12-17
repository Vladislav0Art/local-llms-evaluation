package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedDecodePart_validEncoding {

    @Test
    public void decodePart_validEncoding() {
        String encoded = "%20";
        assertEquals(encoded, UrlBuilder.decodePart(encoded));
    }

}