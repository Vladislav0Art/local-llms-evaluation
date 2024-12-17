package org.jsoup.helper;

public class GeneratedAppendToAscii_shouldEscapeNonASCII_CHAR {

    private static final String PROTOCOL = "https://example.com";
    private static final String PATH = "/path/to/resource";
    private static final String QUERY = "key=value&key2=value2";
    private static final String REF = "#anchor";
    private static final String SPACE = " ";
    private static final String NON_ASCII_CHAR = "\u00E0";

    @Test
    public void appendToAscii_shouldEscapeNonASCII_CHAR() {
        StringBuilder sb = StringUtil.borrowBuilder();
        appendToAscii(NON_ASCII_CHAR, false, sb);
        assert sb.toString().equals("%C3%A0");
    }

}