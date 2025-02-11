package org.jsoup.helper;

public class Generated[UrlBuilder_appendToAscii_WithSpace]

Test {

    @Test
    public void [UrlBuilder_appendToAscii_WithSpace]Test() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("äöü ", false, sb);
        assertEquals("%c3%84%c3%b6%c3%bc %20", sb.toString());
    }

}