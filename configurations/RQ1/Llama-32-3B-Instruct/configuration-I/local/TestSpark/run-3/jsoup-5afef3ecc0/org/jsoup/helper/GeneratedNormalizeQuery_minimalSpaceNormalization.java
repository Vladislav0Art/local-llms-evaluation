package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedNormalizeQuery_minimalSpaceNormalization {

    @Test
    public void normalizeQuery_minimalSpaceNormalization() {
        String q = "key  value";
        assertEquals("key%20value", UrlBuilder.normalizeQuery(q));
    }

}