package org.jsoup.helper;

public class GeneratedAppendToAsciiSpacesAreNormalized {

    @Test
    public void appendToAsciiSpacesAreNormalized() throws UnsupportedEncodingException {
        String input = "café ";
        String expectedOutput = "%e9%ae%bf+";
        StringBuilder sb = StringUtil.borrowBuilder();
        UrlBuilder.appendToAscii(input, true, sb);
        assertEquals(expectedOutput, sb.toString());
    }

}