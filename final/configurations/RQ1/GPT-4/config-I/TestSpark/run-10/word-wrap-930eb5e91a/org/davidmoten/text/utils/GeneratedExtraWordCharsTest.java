package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedExtraWordCharsTest {

    @Test
    public void extraWordCharsTest() {
        Set<Character> chars = new HashSet<>();
        chars.add('a');
        Builder builder = WordWrap.from("This is a sample text.").extraWordChars(chars);
        assertEquals(chars, builder.extraWordChars);
    }

}