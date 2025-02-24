package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuildUrlTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = mock(URL.class);
        urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotNull(outputUrl);
    }

}