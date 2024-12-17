package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedDecodePart {

    @Test
    public void decodePart() {
        String encoded = "%E0th";
        assertEquals("äoth", UrlBuilder.decodePart(encoded));
    }

}