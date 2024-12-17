package org.jsoup.helper;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;

public class GeneratedNormalizeQueryAddsPlusSignsCorrectlyTest {

    @Test
    public void normalizeQueryAddsPlusSignsCorrectlyTest() throws UnsupportedEncodingException {
        String query = "query value";
        String normalized = org.jsoup.helper.UrlBuilder.normalizeQuery(query);
        assertEquals("query+value", normalized);
    }

}