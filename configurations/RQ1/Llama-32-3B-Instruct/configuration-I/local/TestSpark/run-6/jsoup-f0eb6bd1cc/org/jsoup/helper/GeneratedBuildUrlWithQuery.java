package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;

public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() throws Exception {
        // Arrange
        Request request = new Request();
        Response response = new Response();

        // Act and Assert
        UrlBuilder builder = new UrlBuilder(request);
        URL result = builder.build();
        assertEquals("http://example.com", result.getProtocol());
        assertEquals(80, result.getPort());

        KeyVal kv = new KeyVal();
        kv.key = "key";
        kv.value = "value";
        builder.appendKeyVal(kv);
        result = builder.build();
        assertEquals("?key=value", result.getQuery());
    }

}