package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrl_withInputUrl_returnsCorrectUri {

    @Mock
    private Connection connection;

    @Before
    public void setup() {
        // No setup needed for this test class
    }

    @Test
    public void buildUrl_withInputUrl_returnsCorrectUri() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        when(connection.toString()).thenReturn("/path/to/resource");

        URI uri = urlBuilder.build().toURI();
        assertEquals("http://example.com/path/to/resource", uri.toString());
    }

}