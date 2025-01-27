package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_SingleCharacter_ReturnsSingleCharacterWithSpaceAfter {

    @Test
    public void stripLeadingWhitespace_SingleCharacter_ReturnsSingleCharacterWithSpaceAfter() {
        char character = 'a';
        String expected = " a";
        String actual = StringUtil.stripLeadingWhitespace(String.valueOf(character));
        assertEquals(expected, actual);
    }

}