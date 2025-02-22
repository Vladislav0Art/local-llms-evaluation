package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUrlBuilderBuildTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void urlBuilderBuildTest() {
        URL url = mock(URL.class);
        when(urlBuilder.build()).thenReturn(url);
        assertNotNull(urlBuilder.build());
    }

}