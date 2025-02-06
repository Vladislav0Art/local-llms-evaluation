package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_GivenText_ThrowsStringIndexOutOfBoundsException {

    @Test
    public void stripLeadingWhitespace_GivenText_ThrowsStringIndexOutOfBoundsException() {
        StringBuilder sb = Mockito.mock(StringBuilder.class);
        String text = "   Hello World";
        assertThrows(StringIndexOutOfBoundsException.class, () -> StringUtil.stripLeadingWhitespace(text, sb));
    }

}