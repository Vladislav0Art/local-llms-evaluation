package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("https://example.org");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("https://example.org", result.toString());
    }

    @Test
    public void testBuildNullInput() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL result = urlBuilder.build();
        assertNotNull(result);
    }

}