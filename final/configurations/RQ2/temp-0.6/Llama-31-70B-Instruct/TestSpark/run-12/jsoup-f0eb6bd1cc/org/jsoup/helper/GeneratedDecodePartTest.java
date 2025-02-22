package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedDecodePartTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void decodePartTest() {
        String expectedDecoded = "decoded";
        String encoded = "encoded";
        assertEquals(expectedDecoded, UrlBuilder.decodePart(encoded));
    }

}