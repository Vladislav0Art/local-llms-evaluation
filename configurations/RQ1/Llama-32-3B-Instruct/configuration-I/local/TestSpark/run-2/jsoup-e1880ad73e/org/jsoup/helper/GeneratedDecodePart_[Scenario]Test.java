package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedDecodePart_[Scenario]

Test {

    @Test
    public void decodePart_[ Scenario]Test() {
        String encoded = "ä ö";
        assertEquals("a o", UrlBuilder.decodePart(encoded));
    }

}