package org.jsoup.helper;

public class GeneratedAppendToAscii_addsSpaceAsPlusWhenSpaceIsInUnicodeCharacter {

    @Test
    public void appendToAscii_addsSpaceAsPlusWhenSpaceIsInUnicodeCharacter() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        appendToAscii("ä", true, sb);
        assertEquals("+", sb.toString());
    }

}