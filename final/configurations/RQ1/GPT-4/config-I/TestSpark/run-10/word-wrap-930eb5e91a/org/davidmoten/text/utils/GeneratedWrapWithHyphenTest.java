package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWrapWithHyphenTest {

    @Test
    public void wrapWithHyphenTest() {
        String result = WordWrap.from("This-really-long-word-with-hyphen test text").insertHyphens(true).wrap();
        assertEquals("This-really-long-word-with-hyphen test text", result);
    }

}