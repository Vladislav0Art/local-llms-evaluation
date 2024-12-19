package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;

public class GeneratedDecodePart_ThrowsUnsupportedEncodingException {

    @Test
    public void decodePart_ThrowsUnsupportedEncodingException() {
        try {
            String decoded = UrlBuilder.decodePart("äöü");
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }
    }

}