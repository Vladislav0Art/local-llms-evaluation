package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com?query=string");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URI uri = UriUtil.buildUri(urlBuilder.url_);
        assertEquals(new URL("http://example.com?query=string"), new URL(uri.toString()));
    }

}