package org.davidmoten.text.utils;

import java.util.List;
import java.util.Set;

public class GeneratedTestWordWrap_IsWhitespace {

    public static void main(String[] args) {
        new WordWrapTests().testWordWrap_Reader();
        new WordWrapTests().testWordWrap_Lowercase();
        new WordWrapTests().testWordWrap_RightTrim();
        new WordWrapTests().testWordWrap_IsWhitespace();
        new WordWrapTests().testWordWrap_LeftTrim();
    }

    @Test
    public void testWordWrap_IsWhitespace() {
        WordWrap wordWrap = new WordWrap();
        List<Character> inputChars = List.of('.');
        Matcher matcher = wordWrap.wordWrap(inputChars, System.out, " ", 10, s -> (float) s.length(), Set.of('.', '?'), false, true);
        assertTrue(wordWrap.isWhitespace(matcher.toString()));
    }

}