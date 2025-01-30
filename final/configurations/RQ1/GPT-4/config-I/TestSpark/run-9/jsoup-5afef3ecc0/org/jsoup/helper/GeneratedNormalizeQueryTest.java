package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() throws Exception {
        String q = "param1=value1";
        String normalized = UrlBuilder.normalizeQuery(q);
        assertEquals("Should return normalized string", "param1=value1", normalized);
    }

}