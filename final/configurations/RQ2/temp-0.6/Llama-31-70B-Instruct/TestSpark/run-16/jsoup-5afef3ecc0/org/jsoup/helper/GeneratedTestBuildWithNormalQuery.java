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
public class GeneratedTestBuildWithNormalQuery {

    @Mock
    private URL url;

    @Test
    public void testBuildWithNormalQuery() {
        String query = "key=value";
        when(url.getQuery()).thenReturn(query);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(query, urlBuilder.build().getQuery());
    }

}