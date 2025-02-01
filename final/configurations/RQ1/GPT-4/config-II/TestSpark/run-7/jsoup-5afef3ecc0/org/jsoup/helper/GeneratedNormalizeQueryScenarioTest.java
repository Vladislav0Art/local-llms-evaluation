package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNormalizeQueryScenarioTest {

    @Test
    public void normalizeQueryScenarioTest() {
        URL inputUrl = new URL("http://example.com?abc def");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        String result = urlBuilder.normalizeQuery(inputUrl.getQuery());

        assertEquals("abc+def", result);
    }

}