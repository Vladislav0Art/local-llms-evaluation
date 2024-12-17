package org.jsoup.helper;

public class GeneratedAppendToAscii_ignoresSpacesThatAreAlreadyEncoded {

    @Test
    public void appendToAscii_ignoresSpacesThatAreAlreadyEncoded() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        appendToAscii("%20 ", false, sb);
        assertEquals("%20 ", sb.toString());
    }

}