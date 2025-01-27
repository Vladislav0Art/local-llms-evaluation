package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedBuildUrlWithCorrectStringReturnsUrl {

    public void setUp() {
        // No setup needed
    }

    @Test
    public void buildUrlWithCorrectStringReturnsUrl() throws Exception {
        String inputUrl = "http://example.com";
        UrlBuilder builder = new UrlBuilder();
        Mockito.when(connection.toString()).thenReturn(inputUrl);
        assertEquals("http://example.com", builder.build().toString());
    }

}