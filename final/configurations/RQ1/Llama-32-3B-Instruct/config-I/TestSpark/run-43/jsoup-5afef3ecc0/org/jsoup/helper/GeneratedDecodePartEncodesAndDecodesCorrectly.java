package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDecodePartEncodesAndDecodesCorrectly {

    @Test
    public void decodePartEncodesAndDecodesCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String input = "äöü";
        String expectedOutput = "a%e4f6c5f2d";
        assertEquals(expectedOutput, UrlBuilder.decodePart(input));
    }

}