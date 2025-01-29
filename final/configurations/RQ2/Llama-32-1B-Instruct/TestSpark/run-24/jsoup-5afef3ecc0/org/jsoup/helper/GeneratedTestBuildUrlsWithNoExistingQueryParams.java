package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBuildUrlsWithNoExistingQueryParams {

    private String urlString = "https://example.com/path";

    @BeforeEach
    public void setup() {
        URLBuilder urlBuilder = new UrlBuilder(new URI(urlString));
    }

    @Test
    public void testBuildUrlsWithNoExistingQueryParams() throws UnsupportedEncodingException {
        Connection connection = Connection.create(urlString);
        String expectedUrl = urlBuilder.build().toString();
        String actualUrl = urlBuilder.build().toExternalForm();
        assertEquals(expectedUrl, actualUrl);
    }

}