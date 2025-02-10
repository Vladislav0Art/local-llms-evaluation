package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedFromCharacterSequenceReturnsBuilder {

    @Test
    public void fromCharacterSequenceReturnsBuilder() {
        CharSequence text = "text";
        assertEquals(WordWrap.Builder.class, WordWrap.from(text).getClass());
    }

}