package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedAppendToAsciiWithInvalidChar_AppendsEscapeSequence {

    @Test
    public void appendToAsciiWithInvalidChar_AppendsEscapeSequence() {
        String s = "äöü";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(s, true, sb);
        assertEquals("%c3%a4%c3%b6%c3%bc", sb.toString());
    }

}