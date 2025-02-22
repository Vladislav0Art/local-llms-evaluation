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
public class GeneratedTestBuildWithUnencodedQuery {

    @Mock
    private URL url;

    @Test
    public void testBuildWithUnencodedQuery() {
        String query = "key=value&key2=value2";
        when(url.getQuery()).thenReturn(query);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(query.replace(' ', '+'), urlBuilder.build().getQuery());
    }

}