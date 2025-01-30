package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartWithSpecialCharsTest {

    @Test
    public void decodePartWithSpecialCharsTest() {
        String encodedPart = "%23%40%24%25%5E%26";
        String decodedPart = UrlBuilder.decodePart(encodedPart);
        assertEquals("#@$%^&", decodedPart);
    }

}