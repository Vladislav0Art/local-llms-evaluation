package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal_WithNullValue_WithEmptyMap {

    private String urlString = "https://example.com/path";

    @BeforeEach
    public void setup() {
        URLBuilder urlBuilder = new UrlBuilder(new URI(urlString));
    }

    @Test
    public void testAppendKeyVal_WithNullValue_WithEmptyMap() throws UnsupportedEncodingException {
        String expectedQueryParams = "";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(null);
        urlBuilder.appendKeyVal(connection.getKeyVal());
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

}