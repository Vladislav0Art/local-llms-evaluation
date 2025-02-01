package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() {
        String result = UrlBuilder.normalizeRef("space between words");
        assertEquals("space%20between%20words", result);
    }

}