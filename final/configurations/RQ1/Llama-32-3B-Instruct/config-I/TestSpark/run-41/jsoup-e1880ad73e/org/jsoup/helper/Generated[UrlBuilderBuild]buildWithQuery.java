package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class Generated[UrlBuilderBuild]

buildWithQuery {

    @Test
    public void [UrlBuilderBuild]buildWithQuery() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query"));
        URL url = builder.build();
        assertNotNull(url);
        assertEquals(URI.create("http://example.com/").toString(), url.getProtocol());
        assertEquals(URI.create("path?query").toString(), url.getPath());
    }

}