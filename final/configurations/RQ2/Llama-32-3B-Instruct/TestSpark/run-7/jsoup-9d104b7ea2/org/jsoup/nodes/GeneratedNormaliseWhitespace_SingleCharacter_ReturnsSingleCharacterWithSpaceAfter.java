package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_SingleCharacter_ReturnsSingleCharacterWithSpaceAfter {

    @Test
    public void normaliseWhitespace_SingleCharacter_ReturnsSingleCharacterWithSpaceAfter() {
        char character = 'a';
        String expected = " a";
        String actual = StringUtil.normaliseWhitespace(String.valueOf(character));
        assertEquals(expected, actual);
    }

}