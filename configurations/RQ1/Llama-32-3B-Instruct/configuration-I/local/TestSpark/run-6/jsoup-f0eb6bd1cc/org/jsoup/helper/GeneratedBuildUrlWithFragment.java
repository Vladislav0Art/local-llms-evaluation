package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;

public class GeneratedBuildUrlWithFragment {

    @Test
    public void buildUrlWithFragment() throws Exception {
        // Arrange
        Request request = new Request();
        Response response = new Response();

        // Act and Assert
        UrlBuilder builder = new UrlBuilder(request);
        URL result = builder.build();
        assertEquals("http://example.com", result.getProtocol());
        assertEquals(80, result.getPort());

        String fragment = "fragment";
        builder.u.setRef(fragment);
        result = builder.build();
        assertEquals("#" + fragment, result.getRef());
    }

}