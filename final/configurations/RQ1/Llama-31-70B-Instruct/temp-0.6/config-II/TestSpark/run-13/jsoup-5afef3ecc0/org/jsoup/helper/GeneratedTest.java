package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

public class GeneratedTest {

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

    @Test
    public void testAppendKeyVal() throws Exception {
        UrlBuilder.KeyVal keyVal = Mockito.mock(UrlBuilder.KeyVal.class);
        when(urlBuilder.appendKeyVal(keyVal)).thenReturn(urlBuilder);
        assertEquals(urlBuilder, urlBuilder.appendKeyVal(keyVal));
    }

    @Test
    public void testDecodePart() throws Exception {
        String encoded = "encoded";
        String decoded = "decoded";
        when(urlBuilder.decodePart(encoded)).thenReturn(decoded);
        assertEquals(decoded, urlBuilder.decodePart(encoded));
    }

    @Test
    public void testNormalizeQuery() throws Exception {
        String q = "q";
        String normalized = "normalized";
        when(urlBuilder.normalizeQuery(q)).thenReturn(normalized);
        assertEquals(normalized, urlBuilder.normalizeQuery(q));
    }

}