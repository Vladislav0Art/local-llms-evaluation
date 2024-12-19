package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestFromCharacterSequence {

    @Test
    public void testFromCharacterSequence() {
        final StringBuilder text = new StringBuilder("Hello world");
        WordWrap.from(text).wordWrap(0, System.out, null, null, null, null, false, false);
        assertEquals("Hello world\n", text.toString());
    }

}