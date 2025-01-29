package org.davidmoten.text.utils;

import java.util.List;
import java.util.Set;

public class GeneratedTestWordWrap_Lowercase {

    public static void main(String[] args) {
        new WordWrapTests().testWordWrap_Reader();
        new WordWrapTests().testWordWrap_Lowercase();
        new WordWrapTests().testWordWrap_RightTrim();
        new WordWrapTests().testWordWrap_IsWhitespace();
        new WordWrapTests().testWordWrap_LeftTrim();
    }

    @Test
    public void testWordWrap_Lowercase() {
        WordWrap wordWrap = new WordWrap();
        List<Character> inputChars = List.of('A', 'B', 'C');
        Matcher matcher = wordWrap.wordWrap(inputChars, System.out, " ", 10, s -> (float) s.length(), Set.of('.', '?'), false, true);
        assertEquals("abc", matcher.toString());
    }

}