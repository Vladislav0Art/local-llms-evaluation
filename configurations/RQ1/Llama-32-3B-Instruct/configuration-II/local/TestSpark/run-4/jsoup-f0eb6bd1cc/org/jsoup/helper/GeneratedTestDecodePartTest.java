package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecodePartTest {

    @Test
    public void testDecodePartTest() {
        String inputUrl = "http://test.com";
        assertEquals("test.com", UrlBuilder.decodePart(IDN.toASCII(inputUrl.getHost())));
    }

}