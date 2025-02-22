package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBuildWithNullQuery {

    @Mock
    private URL url;

    @Test
    public void testBuildWithNullQuery() {
        when(url.getQuery()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNull(urlBuilder.build().getQuery());
    }

}