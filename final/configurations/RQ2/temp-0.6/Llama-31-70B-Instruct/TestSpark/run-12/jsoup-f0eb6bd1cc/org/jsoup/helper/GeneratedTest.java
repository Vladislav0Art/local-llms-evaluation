package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void buildTest() {
        URL expectedUrl = Mockito.mock(URL.class);
        Mockito.when(urlBuilder.build()).thenReturn(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValTest() throws Exception {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void decodePartTest() {
        String expectedDecoded = "decoded";
        String encoded = "encoded";
        assertEquals(expectedDecoded, UrlBuilder.decodePart(encoded));
    }

    @Test
    public void appendToAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        String s = "s";
        boolean spaceAsPlus = true;
        UrlBuilder.appendToAscii(s, spaceAsPlus, sb);
    }

}