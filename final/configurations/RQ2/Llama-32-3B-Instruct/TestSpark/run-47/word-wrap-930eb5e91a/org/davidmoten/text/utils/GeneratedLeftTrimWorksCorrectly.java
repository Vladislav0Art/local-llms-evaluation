package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedLeftTrimWorksCorrectly {

    @Test
    public void leftTrimWorksCorrectly() {
        StringBuilder2 word = new StringBuilder2();
        word.append("   ");
        WordWrap.leftTrim(word);
        assertEquals("", word.toString());
    }

}