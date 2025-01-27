package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLeftTrimStringBuilder2ReturnCorrectOutput {

    @Test
    public void leftTrimStringBuilder2ReturnCorrectOutput() {
        StringBuilder word = new StringBuilder();
        WordWrap.leftTrim(word);
        assertEquals(0, word.length());
    }

}