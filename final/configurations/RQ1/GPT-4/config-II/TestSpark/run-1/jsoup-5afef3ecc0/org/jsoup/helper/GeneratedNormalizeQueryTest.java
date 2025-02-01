package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        String result = UrlBuilder.normalizeQuery("space between words");
        assertEquals("space+between+words", result);
    }

}