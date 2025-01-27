package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildUrlFromEmptyUrl {

    @Test
    public void buildUrlFromEmptyUrl() throws MalformedURLException {
        // Given:
        UrlBuilder builder = new UrlBuilder(null);

        // When:
        URL url = builder.build();

        // Then:
        assertNotNull(url);
    }

}