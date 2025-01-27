package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_returnValidUrl {

    @Mock
    private Connection connection;

    @Test
    public void build_returnValidUrl() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        String expected = "http%3A//example.com";
        URI uri = new URI(builder.build());
        assertEquals(expected, uri.toString());
    }

}