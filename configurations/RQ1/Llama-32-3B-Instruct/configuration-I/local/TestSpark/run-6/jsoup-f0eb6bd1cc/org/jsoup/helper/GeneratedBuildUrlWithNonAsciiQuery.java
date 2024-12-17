package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;

public class GeneratedBuildUrlWithNonAsciiQuery {

    @Test
    public void buildUrlWithNonAsciiQuery() throws Exception {
        // Arrange
        Request request = new Request();
        Response response = new Response();

        // Act and Assert
        UrlBuilder builder = new UrlBuilder(request);
        URL result = builder.build();
        assertEquals("http://example.com", result.getProtocol());
        assertEquals(80, result.getPort());

        String query = "key=ävalue";
        request.setQuery(query);
        result = builder.build();
        assertEquals("key%3D%C3%A4value", result.getQuery());
    }

}