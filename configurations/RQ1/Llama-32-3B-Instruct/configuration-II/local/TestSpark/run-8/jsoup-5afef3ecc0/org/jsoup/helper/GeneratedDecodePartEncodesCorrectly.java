package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedDecodePartEncodesCorrectly {

    @Test
    public void decodePartEncodesCorrectly() {
        String encoded = "example+com";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("example.com", decoded);
    }

}