package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws Exception {
        String encoded = "param1%3Dvalue1";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("Should return decoded string", "param1=value1", decoded);
    }

}