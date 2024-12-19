package org.jsoup.helper;

public class GeneratedAppendToAsciiPreservesExistingEscapes {

    @Test
    public void appendToAsciiPreservesExistingEscapes() throws UnsupportedEncodingException {
        String input = "café";
        String expectedOutput = "%e9%ae%bf";
        StringBuilder sb = StringUtil.borrowBuilder();
        UrlBuilder.appendToAscii(input, false, sb);
        assertEquals(expectedOutput, sb.toString());
    }

}