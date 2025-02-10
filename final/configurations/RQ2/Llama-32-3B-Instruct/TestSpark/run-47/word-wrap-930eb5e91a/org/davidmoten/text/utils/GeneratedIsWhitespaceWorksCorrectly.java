package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedIsWhitespaceWorksCorrectly {

    @Test
    public void isWhitespaceWorksCorrectly() {
        CharSequence s = " ";
        assertTrue(WordWrap.isWhitespace(s));
    }

}