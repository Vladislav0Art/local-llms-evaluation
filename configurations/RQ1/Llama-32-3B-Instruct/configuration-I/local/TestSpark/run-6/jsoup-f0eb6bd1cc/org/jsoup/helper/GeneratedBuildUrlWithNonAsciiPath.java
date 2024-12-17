package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;

public class GeneratedBuildUrlWithNonAsciiPath {

    @Test
    public void buildUrlWithNonAsciiPath() throws Exception {
        // Arrange
        Request request = new Request();
        Response response = new Response();

        // Act and Assert
        UrlBuilder builder = new UrlBuilder(request);
        URL result = builder.build();
        assertEquals("http://example.com", result.getProtocol());
        assertEquals(80, result.getPort());

        String path = "path";
        for (int i = 0; i < path.length(); i++) {
            path = "ä" + path.substring(i + 1);
        }
        request.setPath(path);
        result = builder.build();
        assertEquals("http://example.com/path", result.getPath());
    }

}