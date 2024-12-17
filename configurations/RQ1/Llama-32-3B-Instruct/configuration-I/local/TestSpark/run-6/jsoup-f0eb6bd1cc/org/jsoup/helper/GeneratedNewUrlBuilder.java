package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;

public class GeneratedNewUrlBuilder {

    @Test
    public void newUrlBuilder() {
        // Arrange and Act
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assert builder.u != null;

        // Assert
        assert builder.q == null;
    }

}