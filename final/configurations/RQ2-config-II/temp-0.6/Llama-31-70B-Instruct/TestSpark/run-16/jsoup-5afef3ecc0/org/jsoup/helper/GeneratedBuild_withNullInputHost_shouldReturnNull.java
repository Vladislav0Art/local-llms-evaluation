package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedBuild_withNullInputHost_shouldReturnNull {

    @Mock
    private URL inputUrl;

    @Test
    public void build_withNullInputHost_shouldReturnNull() throws MalformedURLException {
        Mockito.when(inputUrl.getHost()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL normalizedUrl = urlBuilder.build();

        assertNull(normalizedUrl);
    }

}