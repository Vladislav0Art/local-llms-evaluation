package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWordWrapWithoutExtraChars {

    @Test
    public void testWordWrapWithoutExtraChars() {
        String text = "This is a test";
        int maxWidth = 20;
        Set<Character> extraWordChars = new HashSet<>();
        assertTrue(WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), System.out, maxWidth, null, null, extraWordChars, false, true) == text);
    }

}