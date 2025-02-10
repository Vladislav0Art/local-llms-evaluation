package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOfUrl BuildsUrl {

    @Mock
    private Connection connection;

    @Before
    public void setUp() {
        // Setup necessary objects here.
    }

    @Test
    public void ofUrl

    BuildsUrl() {
        // Given: url to build from
        URL inputUrl = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // When: Build the url
        URL actualUrl = builder.build();

        // Then: The resulting url is correct
        assertNotNull(actualUrl);
    }

}