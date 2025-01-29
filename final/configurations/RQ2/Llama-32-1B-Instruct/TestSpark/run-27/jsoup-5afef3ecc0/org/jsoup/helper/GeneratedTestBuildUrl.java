package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.URLDecoder;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildUrl {

    public UrlBuilder newUrlBuilder() {
        return new UrlBuilder(null);
    }

    @Test
    public void testBuildUrl() {
        String inputUrl = "https://example.com/path?query=param";
        UrlBuilder urlBuilder = newUrlBuilder();
        URL url = urlBuilder.build();

        // Use assertNotEquals for different results
        assertNotNull(url, "Invalid build method");
        assertTrue(new URI(url.toString()).getScheme().equals("https"), "Incorrect scheme");
        assertEquals("/path", new URI(url.toString()).getPath(), "Incorrect path");

        String[] parts = url.toString().split("/");
        assertEquals(4, parts.length);
    }

}