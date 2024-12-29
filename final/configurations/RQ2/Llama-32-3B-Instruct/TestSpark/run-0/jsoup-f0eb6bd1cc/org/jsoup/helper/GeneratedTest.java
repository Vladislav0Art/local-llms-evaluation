package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

public class GeneratedTest {

    @Mock
    private URL inputUrl;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    public void testConstructor() throws MalformedURLException, URISyntaxException {
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder);
        assertEquals(inputUrl, builder.inputUrl());
    }

    public void testBuild() throws MalformedURLException, URISyntaxException {
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        assertNotNull(url);
        assertEquals(inputUrl, url);
    }

}