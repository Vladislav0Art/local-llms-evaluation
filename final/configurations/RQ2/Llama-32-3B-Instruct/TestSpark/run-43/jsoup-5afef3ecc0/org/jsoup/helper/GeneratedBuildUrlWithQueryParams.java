package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

public class GeneratedBuildUrlWithQueryParams {

    @Test
    public void buildUrlWithQueryParams() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com?param1=value1&param2=value2");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://example.com?param1=value1&param2=value2", result.toString());
    }

}