package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URL result = new UrlBuilder(inputUrl).build();
        assertEquals("https://example.com/path?param1=value1&param2=value2", result.toURI().toString());
    }

}