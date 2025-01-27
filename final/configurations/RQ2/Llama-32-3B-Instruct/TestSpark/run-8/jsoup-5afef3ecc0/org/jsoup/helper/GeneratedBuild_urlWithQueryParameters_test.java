package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;

public class GeneratedBuild_urlWithQueryParameters_test {

    @Test
    public void build_urlWithQueryParameters_test() throws MalformedURLException, URISyntaxException {
        Connection connection = mock(Connection.class);
        when(connection.getUri()).thenReturn(URI.create("https://example.com?a=1&b=2"));
        UrlBuilder urlBuilder = new UrlBuilder(connection);
        URL result = urlBuilder.build();
        assertEquals(new URI("https://example.com?1=a&2=b"), result.toURI());
    }

}