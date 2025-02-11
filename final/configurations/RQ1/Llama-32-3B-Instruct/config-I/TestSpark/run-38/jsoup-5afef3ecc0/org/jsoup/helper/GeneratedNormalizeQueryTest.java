package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        String query = "foo bar";
        String result = UrlBuilder.normalizeQuery(query);
        assertEquals("foo+bar", result);
    }

}