package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedDecodePart_[UnsupportedEncoding]

Test {

    @Test
    public void decodePart_[ UnsupportedEncoding]Test() {
        String encoded = "ä ö";
        try {
            UrlBuilder.decodePart(encoded);
            fail();
        } catch (RuntimeException e) {
            // expected
        }
    }

}