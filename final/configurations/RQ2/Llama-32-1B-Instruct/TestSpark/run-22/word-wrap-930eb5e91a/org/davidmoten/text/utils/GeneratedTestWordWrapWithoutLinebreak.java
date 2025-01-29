package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWordWrapWithoutLinebreak {

    @Test
    public void testWordWrapWithoutLinebreak() {
        String text = "This is a test";
        int maxWidth = 20;
        assertTrue(WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), System.out, maxWidth, null, null, new HashSet<>(), false, true) == text);
    }

}