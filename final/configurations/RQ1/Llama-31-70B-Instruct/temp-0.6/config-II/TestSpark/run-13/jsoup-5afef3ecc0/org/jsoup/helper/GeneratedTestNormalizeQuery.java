package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

public class GeneratedTestNormalizeQuery {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void testNormalizeQuery() throws Exception {
        String q = "q";
        String normalized = "normalized";
        when(urlBuilder.normalizeQuery(q)).thenReturn(normalized);
        assertEquals(normalized, urlBuilder.normalizeQuery(q));
    }

}