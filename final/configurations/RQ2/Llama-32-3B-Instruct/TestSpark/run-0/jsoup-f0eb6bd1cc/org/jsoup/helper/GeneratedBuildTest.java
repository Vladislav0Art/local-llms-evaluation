package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedBuildTest {

    @Mock
    private URL inputUrl;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        assertNotNull(url);
        assertEquals(inputUrl, url);
    }

}