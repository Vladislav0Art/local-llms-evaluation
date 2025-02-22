package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

public class GeneratedTestBuild {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void testBuild() throws Exception {
        URL url = Mockito.mock(URL.class);
        when(urlBuilder.build()).thenReturn(url);
        assertEquals(url, urlBuilder.build());
    }

}