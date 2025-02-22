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
public class GeneratedTest {

    @Mock
    private URL url;

    @Test
    public void testBuildWithNullQuery() {
        when(url.getQuery()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNull(urlBuilder.build().getQuery());
    }

    @Test
    public void testBuildWithNormalQuery() {
        String query = "key=value";
        when(url.getQuery()).thenReturn(query);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(query, urlBuilder.build().getQuery());
    }

    @Test
    public void testBuildWithUnencodedQuery() {
        String query = "key=value&key2=value2";
        when(url.getQuery()).thenReturn(query);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(query.replace(' ', '+'), urlBuilder.build().getQuery());
    }

    @Test
    public void testBuildWithNullRef() {
        when(url.getRef()).thenReturn(null);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNull(urlBuilder.build().getRef());
    }

    @Test
    public void testBuildWithNormalRef() {
        String ref = "ref";
        when(url.getRef()).thenReturn(ref);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(ref, urlBuilder.build().getRef());
    }

}