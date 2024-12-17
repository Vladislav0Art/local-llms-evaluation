package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        String query = "a=1 b=2";
        assertEquals("a=1+b", UrlBuilder.normalizeQuery(query));
    }

}