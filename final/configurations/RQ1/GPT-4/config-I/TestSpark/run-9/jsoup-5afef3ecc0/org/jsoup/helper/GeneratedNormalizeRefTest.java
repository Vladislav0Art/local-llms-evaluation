package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() throws Exception {
        String r = "reference";
        String normalized = UrlBuilder.normalizeRef(r);
        assertEquals("Should return normalized string", "reference", normalized);
    }

}