package org.davidmoten.text.utils;

import java.util.List;
import java.util.Set;

public class GeneratedTestWordWrap_LeftTrim {

    public static void main(String[] args) {
        new WordWrapTests().testWordWrap_Reader();
        new WordWrapTests().testWordWrap_Lowercase();
        new WordWrapTests().testWordWrap_RightTrim();
        new WordWrapTests().testWordWrap_IsWhitespace();
        new WordWrapTests().testWordWrap_LeftTrim();
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