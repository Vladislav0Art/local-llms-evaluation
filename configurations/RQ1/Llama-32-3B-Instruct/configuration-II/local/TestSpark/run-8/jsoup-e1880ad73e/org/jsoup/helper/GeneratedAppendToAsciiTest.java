package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("ä", false, sb);
        assertEquals("%C3%A4", sb.toString());
        UrlBuilder.appendToAscii("é", true, sb);
        assertEquals("%E2%82%AC", sb.toString());
    }

}