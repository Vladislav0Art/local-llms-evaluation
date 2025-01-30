package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDecodePartValidTest {

    @Test
    public void decodePartValidTest() {
        String expected = "testing";
        assertEquals(expected, UrlBuilder.decodePart("testing"));
    }

}