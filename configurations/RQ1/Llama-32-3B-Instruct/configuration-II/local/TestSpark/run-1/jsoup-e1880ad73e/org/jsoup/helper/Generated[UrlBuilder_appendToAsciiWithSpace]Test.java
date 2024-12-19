package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_appendToAsciiWithSpace]

Test {

    @Test
    public void [UrlBuilder_appendToAsciiWithSpace]Test() {
        String s = "äöü ";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(s, true, sb);
        assertEquals("%C3%A4%C3%B6%C3%BC", sb.toString());
    }

}