package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;

public class GeneratedBuild_urlWithNoParameters_test {

    @Test
    public void build_urlWithNoParameters_test() throws MalformedURLException, URISyntaxException {
        Connection connection = mock(Connection.class);
        when(connection.getUri()).thenReturn(URI.create("https://example.com"));
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL result = urlBuilder.build();
        assertEquals(new URI("https://example.com"), result.toURI());
    }

}