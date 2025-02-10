package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedBuildUrlFromValidInput {

    @Test
    public void buildUrlFromValidInput() throws MalformedURLException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://example.com", result.toString());
    }

}