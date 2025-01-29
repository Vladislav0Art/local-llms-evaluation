package org.davidmoten.text.utils;

import java.util.List;
import java.util.Set;

public class GeneratedTest {

    public static void main(String[] args) {
        new WordWrapTests().testWordWrap_Reader();
        new WordWrapTests().testWordWrap_Lowercase();
        new WordWrapTests().testWordWrap_RightTrim();
        new WordWrapTests().testWordWrap_IsWhitespace();
        new WordWrapTests().testWordWrap_LeftTrim();
    }

    @Test
    public void testWordWrap_Reader() {
        WordWrap wordWrap = new WordWrap();
        List<Character> inputChars = List.of('a', 'b', 'c');
        Matcher matcher = wordWrap.wordWrap(inputChars, System.out, " ", 10, s -> (float) s.length(), Set.of('.', '?'), false, true);
        assertEquals("abc", matcher.toString());
    }

    @Test
    public void testWordWrap_Lowercase() {
        WordWrap wordWrap = new WordWrap();
        List<Character> inputChars = List.of('A', 'B', 'C');
        Matcher matcher = wordWrap.wordWrap(inputChars, System.out, " ", 10, s -> (float) s.length(), Set.of('.', '?'), false, true);
        assertEquals("abc", matcher.toString());
    }

    @Test
    public void testWordWrap_RightTrim() {
        WordWrap wordWrap = new WordWrap();
        List<Character> inputChars = List.of('a', 'b', 'c');
        Matcher matcher = wordWrap.wordWrap(inputChars, System.out, " ", 10, s -> (float) s.length(), Set.of('.', '?'), false, true);
        assertEquals("abc", matcher.toString());
    }

    @Test
    public void testWordWrap_IsWhitespace() {
        WordWrap wordWrap = new WordWrap();
        List<Character> inputChars = List.of('.');
        Matcher matcher = wordWrap.wordWrap(inputChars, System.out, " ", 10, s -> (float) s.length(), Set.of('.', '?'), false, true);
        assertTrue(wordWrap.isWhitespace(matcher.toString()));
    }

    @Test
    public void testWordWrap_LeftTrim() {
        WordWrap wordWrap = new WordWrap();
        StringBuilder2 word = new StringBuilder2("abc");
        word.append('x');
        Matcher matcher = wordWrap.leftTrim(word);
        assertEquals("abc", matcher.toString());
    }
}

class StringBuilder2 {

    private final List<Character> characters;

    public StringBuilder2(String str) {
        this.characters = str.toCharArray();
    }

    public void append(char c) {
        characters.add(c);
    }

    @Override
    public String toString() {
        return new String(characters);
    }

}