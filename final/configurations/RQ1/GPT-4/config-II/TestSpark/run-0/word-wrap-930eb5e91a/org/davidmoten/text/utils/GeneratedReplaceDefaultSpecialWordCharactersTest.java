package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedReplaceDefaultSpecialWordCharactersTest {

    @Test
    public void replaceDefaultSpecialWordCharactersTest() {
        Set<Character> newExtraWordChars = new HashSet<>();
        newExtraWordChars.add('~');
        String input = "Hello+world";
        String output = WordWrap.from(input).extraWordChars(newExtraWordChars).wrap();
        assertEquals("Hello\n+world", output);
    }

}