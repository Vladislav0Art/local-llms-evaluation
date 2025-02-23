package org.jsoup.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws IOException {
        String encoded = URLEncoder.encode("abc123", StandardCharsets.UTF_8);
        URL url = new URL("http://www.example.com/search?q=" + encoded);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com/search?q=abc123", result.toString());
    }

}