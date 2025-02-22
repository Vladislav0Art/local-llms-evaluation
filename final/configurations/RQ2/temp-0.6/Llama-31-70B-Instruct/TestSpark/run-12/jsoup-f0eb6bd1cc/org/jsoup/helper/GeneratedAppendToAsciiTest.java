package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedAppendToAsciiTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void appendToAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        String s = "s";
        boolean spaceAsPlus = true;
        UrlBuilder.appendToAscii(s, spaceAsPlus, sb);
    }

}