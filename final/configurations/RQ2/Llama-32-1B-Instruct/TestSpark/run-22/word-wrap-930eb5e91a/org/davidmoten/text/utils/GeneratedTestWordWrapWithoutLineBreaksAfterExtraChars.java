package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWordWrapWithoutLineBreaksAfterExtraChars {

    @Test
    public void testWordWrapWithoutLineBreaksAfterExtraChars() {
        StringBuilder word = new StringBuilder();
        Set<Character> extraWordChars = new HashSet<>();
        word.append('x');
        WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), System.out, 10, null, null, extraWordChars, false, true) == "xx";
    }

}