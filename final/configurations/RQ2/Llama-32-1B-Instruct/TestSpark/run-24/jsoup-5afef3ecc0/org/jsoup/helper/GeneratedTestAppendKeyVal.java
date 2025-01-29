package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class GeneratedTestAppendKeyVal {

    private String urlString = "https://example.com/path";

    @BeforeEach
    public void setup() {
        URLBuilder urlBuilder = new UrlBuilder(new URI(urlString));
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String expectedQueryParams = "foo=bar&baz=qux";
        Connection connection = Connection.create(urlString);
        urlBuilder.appendKeyVal(connection.getKeyVal("foo", "bar"));
        String actualQueryString = urlBuilder.build().getQuery();
        assertEquals(expectedQueryParams, actualQueryString);
    }

}