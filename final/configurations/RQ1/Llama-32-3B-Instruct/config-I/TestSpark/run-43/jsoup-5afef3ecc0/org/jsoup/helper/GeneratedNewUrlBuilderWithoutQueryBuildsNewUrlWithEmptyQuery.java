package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewUrlBuilderWithoutQueryBuildsNewUrlWithEmptyQuery {

    @Test
    public void newUrlBuilderWithoutQueryBuildsNewUrlWithEmptyQuery() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.u);
        assertEquals("", ((URL) urlBuilder.u).getQuery());
    }

}