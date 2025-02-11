package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class Generated[UrlBuilderBuild]

buildWithMultipleParts {

    @Test
    public void [UrlBuilderBuild]buildWithMultipleParts() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query#fragment"));
        URL url = builder.build();
        assertNotNull(url);
        assertEquals(URI.create("http://example.com/").toString(), url.getProtocol());
        assertEquals(URI.create("path?query#fragment").toString(), url.getPath());
    }

}