package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBuild_nullUrl {

    @Mock
    private URL url;

    @Test
    public void testBuild_nullUrl() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL normalizedUrl = urlBuilder.build();

        assertEquals(null, normalizedUrl);
    }

}